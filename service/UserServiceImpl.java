package com.xhx.service;

import com.xhx.dao.UserRepository;
import com.xhx.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xhx on 2021/3/5
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
//        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
