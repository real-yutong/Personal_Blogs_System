package com.xhx.service;

import com.xhx.po.User;

/**
 * Created by xhx on 2021/3/5
 */
public interface UserService {

    User checkUser(String username, String password);
}
