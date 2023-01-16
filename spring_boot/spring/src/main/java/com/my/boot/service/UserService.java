package com.my.boot.service;

import com.my.boot.entity.User;
import com.my.boot.vo.UserQueryVo;

import java.util.List;

/**
 * (User)表服务接口
 */
public interface UserService {

    /**
     * 新增数据
     */
    User insert(User user);

}