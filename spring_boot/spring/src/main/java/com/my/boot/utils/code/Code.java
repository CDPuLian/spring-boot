package com.my.boot.utils.code;

public interface Code {
    // 成功
    int SUCCESS  = Errs.put(200, "成功");

    // 操作有误
    int ERROR	 = Errs.put(-1, "操作有误");
    // 未知错误
    int LOGIN_OUT	 = Errs.put(-2, "登录失效");
    // 账号或密码错误
    int LOGIN_NOT_EXIST	 = Errs.put(-3, "账号或密码错误");
    //新增失败
    int ADD_ERROR	 = Errs.put(-4, "新增失败");
    //编辑失败
    int EDIT_ERROR =Errs.put(-5,"编辑失败");
    //删除失败
    int DELETE_ERROR =Errs.put(-6,"删除失败");
    //登录成功
    int LOGIN_SUCCESS  = Errs.put(201, "登录成功");

    //申请人不存在
    int APPLY_USER_ERROR =Errs.put(-15,"申请人不存在");
    //处理人不存在
    int APPLY_PROC_ERROR =Errs.put(-7,"处理人不存在");
    //不可更改
    int NO_UPDATE =Errs.put(-8,"已通过/驳回，不可编辑！");
    //不可删除
    int NO_DELETE =Errs.put(-9,"已通过/驳回，不可删除！");
    //办公用品没那么多
    int NO_SUPPLY =Errs.put(-10,"没那么多");

    //不可驳回
    int NO_REJECT =Errs.put(-20,"已通过/驳回，不可驳回！");
    //不可通过
    int NO_PASS =Errs.put(-21,"已通过/驳回，不可通过！");

}
