package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UsersAndLongCommentsAndMoviesMapper;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMoviesExample;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsAndMoviesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersAndLongCommentsAndMoviesServiceImpl implements UsersAndLongCommentsAndMoviesService {

    @Resource
    private UsersAndLongCommentsAndMoviesMapper usersAndLongCommentsAndMoviesMapper;

    @Override
    public long countByExample(UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndLongCommentsAndMovies record) {
        return usersAndLongCommentsAndMoviesMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndLongCommentsAndMovies record) {
        return usersAndLongCommentsAndMoviesMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndLongCommentsAndMovies> selectByExample(UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndLongCommentsAndMovies record, UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndLongCommentsAndMovies record, UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndLongCommentsAndMovies> list) {
        return usersAndLongCommentsAndMoviesMapper.batchInsert(list);
    }

    /**
     * 在用户信息页面显示的长评
     *
     * @param userId 用户id
     * @return
     */
    @Override
    public List<UsersAndLongCommentsAndMovies> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize) {
        return usersAndLongCommentsAndMoviesMapper.selectByUserId(userId, pageIndex, pageSize);
    }

    /**
     * 用户id的长评总数
     *
     * @param userId
     * @return
     */
    @Override
    public long countLongComments(Integer userId) {
        return usersAndLongCommentsAndMoviesMapper.countLongComments(userId);
    }

    @Override
    public List<UsersAndLongCommentsAndMovies> searchLongCommentsByTitle(String str) {
        UsersAndLongCommentsAndMoviesExample example = new UsersAndLongCommentsAndMoviesExample();
        example.createCriteria().andLongcommentstitleLike(String.format("%%%s%%", str));
        return usersAndLongCommentsAndMoviesMapper.selectByExample(example);
    }

    @Override
    public UsersAndLongCommentsAndMovies getLongCommentsById(int id) {
        UsersAndLongCommentsAndMoviesExample example = new UsersAndLongCommentsAndMoviesExample();
        example.createCriteria().andLongcommentsidEqualTo(id);
        List<UsersAndLongCommentsAndMovies> longCommentsAndMovies = usersAndLongCommentsAndMoviesMapper.selectByExample(example);
        if (longCommentsAndMovies.size() > 0) {
            return longCommentsAndMovies.get(0);
        }
        return null;
    }

    @Override
    public List<UsersAndLongCommentsAndMovies> getHotComments(int num) {
        if (num < 0 || num > 30) {
            num = 30;
        }
        return usersAndLongCommentsAndMoviesMapper.getHotComments(num);
    }
}




