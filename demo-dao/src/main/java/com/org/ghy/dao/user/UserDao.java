package com.org.ghy.dao.user;

import com.org.ghy.entity.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-7-17.
 */
public interface UserDao {
    List<UserEntity> queryUserList();
}
