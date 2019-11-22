package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UserInfoMapper;
import com.dbcourse.curriculum_design.mapper.UsersMapper;
import com.dbcourse.curriculum_design.model.UserInfo;
import com.dbcourse.curriculum_design.model.Users;
import com.dbcourse.curriculum_design.model.UsersExample;
import com.dbcourse.curriculum_design.service.UsersService;
import com.dbcourse.curriculum_design.utils.SHA256Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public long countByExample(UsersExample example) {
        return usersMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersExample example) {
        return usersMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return usersMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Users record) {
        // TODO 检测是否已有用户，如果有抛出异常
        record.setCPassword(SHA256Util.Encrypt(String.format("%s-%s", record.getCPassword(), record.getCCreateTime())));
        usersMapper.insert(record);
        return userInfoMapper.insert(UserInfo.builder().nUserId(record.getNId()).cName(record.getCUsername()).build());
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    @Override
    public Users selectByPrimaryKey(Integer nId) {
        return usersMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Users record, UsersExample example) {
        return usersMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Users record, UsersExample example) {
        return usersMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Users> list) {
        return usersMapper.batchInsert(list);
    }


    @Override
    public Users selectUserByEmailOrPhone(String user) {
        UsersExample example = new UsersExample();
        example.createCriteria().andCEmailEqualTo(user);
        example.or().andCPhonenumEqualTo(user);
        List<Users> users = usersMapper.selectByExample(example);
        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Users loginUserByEmailOrPhone(String userNum, String password) {
        UsersExample example = new UsersExample();
        example.createCriteria().andCEmailEqualTo(userNum);
        example.or().andCPhonenumEqualTo(userNum);
        List<Users> users = usersMapper.selectByExample(example);
        if (userNum.length() > 0) {
            Users user = users.get(0);
            String needVerifyPassword = SHA256Util.Encrypt(String.format("%s-%s", password, user.getCCreateTime()));
            if (needVerifyPassword != null && needVerifyPassword.equals(user.getCPassword())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void updatePasswordByUserId(int userId, String password) {
        UsersExample example = new UsersExample();
        example.createCriteria().andNIdEqualTo(userId);
        Users users = usersMapper.selectByPrimaryKey(userId);
        usersMapper.updateByPrimaryKeySelective(Users.builder().nId(userId).cPassword(
                SHA256Util.Encrypt(String.format("%s-%s", password, users.getCCreateTime()))
        ).build());
    }
}
