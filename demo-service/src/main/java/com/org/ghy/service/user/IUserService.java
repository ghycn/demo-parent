package com.org.ghy.service.user;

import com.org.ghy.entity.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2017-7-17.
 */
public interface IUserService {
    /**
     * 查询用户list
     * @return
     */
    List<UserEntity> queryUserList();
}
