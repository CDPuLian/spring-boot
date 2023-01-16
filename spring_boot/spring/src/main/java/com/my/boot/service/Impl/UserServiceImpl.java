package com.my.boot.service.Impl;

import com.my.boot.dao.UserDao;
import com.my.boot.dto.UserDTO;
import com.my.boot.entity.User;
import com.my.boot.service.UserService;
import com.my.boot.vo.UserQueryVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-07-13 15:13:39
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }
}
