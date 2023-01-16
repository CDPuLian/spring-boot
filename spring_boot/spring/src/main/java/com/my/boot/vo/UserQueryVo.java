package com.my.boot.vo;

import com.my.boot.entity.User;
import lombok.Data;

/**
 * ClassName: UserQueryVo
 */
@Data
public class UserQueryVo extends User {
    private String authorityName;//用户类型名称
}
