package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.mapper.UsersAndDiscussesRepliesMapper;
import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesRepliesExample;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesReplies;
import com.dbcourse.curriculum_design.service.UsersAndDiscussesRepliesService;
@Service
public class UsersAndDiscussesRepliesServiceImpl implements UsersAndDiscussesRepliesService {

    @Resource
    private UsersAndDiscussesRepliesMapper usersAndDiscussesRepliesMapper;

    @Override
    public long countByExample(UsersAndDiscussesRepliesExample example) {
        return usersAndDiscussesRepliesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndDiscussesRepliesExample example) {
        return usersAndDiscussesRepliesMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndDiscussesReplies record) {
        return usersAndDiscussesRepliesMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndDiscussesReplies record) {
        return usersAndDiscussesRepliesMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndDiscussesReplies> selectByExample(UsersAndDiscussesRepliesExample example) {
        return usersAndDiscussesRepliesMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndDiscussesReplies record, UsersAndDiscussesRepliesExample example) {
        return usersAndDiscussesRepliesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndDiscussesReplies record, UsersAndDiscussesRepliesExample example) {
        return usersAndDiscussesRepliesMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndDiscussesReplies> list) {
        return usersAndDiscussesRepliesMapper.batchInsert(list);
    }

    @Override
    public List<UsersAndDiscussesReplies> getRepliesByIdAndPage(int id, int page, int size) {
        return usersAndDiscussesRepliesMapper.getRepliesByPage(id, page, size);
    }

    public List<UsersAndDiscussesReplies> getRepliesByParentsIds(List<Integer> ids) {
        UsersAndDiscussesRepliesExample example = new UsersAndDiscussesRepliesExample();
        example.createCriteria().andDiscussesidIn(ids);
        return usersAndDiscussesRepliesMapper.selectByExample(example);
    }
}

