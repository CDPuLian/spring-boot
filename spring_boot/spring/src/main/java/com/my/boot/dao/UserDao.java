package com.my.boot.dao;

import com.my.boot.dto.UserDTO;
import com.my.boot.entity.User;
import com.my.boot.vo.UserQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (User)表数据库访问层
 */
public interface UserDao {
    /**
     * 新增数据
     */
    int insert(User user);
}