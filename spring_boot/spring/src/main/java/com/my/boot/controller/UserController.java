package com.my.boot.controller;

import com.my.boot.dto.UserDTO;
import com.my.boot.entity.User;
import com.my.boot.service.UserService;
import com.my.boot.utils.DataResult;
import com.my.boot.utils.code.Code;
import com.my.boot.vo.UserQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-07-13 15:13:39
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 添加用户
     *
     * @param user 用户
     * @return 单条数据
     */
    @PostMapping("addUser")
    public DataResult addUser(User user){
        User insert = userService.insert(user);
        if (insert == null){
            return DataResult.errByErrCode(Code.ADD_ERROR);
        }else{
            return DataResult.succ();
        }

    }

}