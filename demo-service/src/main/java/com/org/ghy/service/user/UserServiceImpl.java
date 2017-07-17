package com.org.ghy.service.user;

import com.org.ghy.dao.user.UserDao;
import com.org.ghy.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017-7-17.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDao userDao;
    /**
     * 查询用户list
     *
     * @return
     */
    public List<UserEntity> queryUserList() {
        return  userDao.queryUserList();
    }
}
