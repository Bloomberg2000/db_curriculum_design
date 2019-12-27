package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UsersAndLongCommentsMapper;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsExample;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersAndLongCommentsServiceImpl implements UsersAndLongCommentsService {

    @Resource
    private UsersAndLongCommentsMapper usersAndLongCommentsMapper;

    @Override
    public long countByExample(UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndLongComments record) {
        return usersAndLongCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndLongComments record) {
        return usersAndLongCommentsMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndLongComments> selectByExample(UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndLongComments record, UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndLongComments record, UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndLongComments> list) {
        return usersAndLongCommentsMapper.batchInsert(list);
    }


    @Override
    public UsersAndLongComments getLongCommentsById(int longCommentsId) {
        UsersAndLongCommentsExample example = new UsersAndLongCommentsExample();
        example.createCriteria().andLongcommentsidEqualTo(longCommentsId);
        List<UsersAndLongComments> comments = usersAndLongCommentsMapper.selectByExample(example);
        if (comments.size() > 0) {
            return comments.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<UsersAndLongComments> selectByMovieId(Integer MovieId) {
        UsersAndLongCommentsExample example = new UsersAndLongCommentsExample();
        example.createCriteria().andMovieidEqualTo(MovieId);
        return usersAndLongCommentsMapper.selectByExample(example);
    }

    @Override
    public List<UsersAndLongComments> getLongCommentsByPage(int movieId, int page, int size) {
        if (page <= 0) {
            page = 1;
        }
        if (size <= 0) {
            size = 10;
        }
        return usersAndLongCommentsMapper.getLongCommentsByPage(movieId, page, size);
    }
}


