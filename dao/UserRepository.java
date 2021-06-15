package com.xhx.dao;

import com.xhx.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xhx on 2021/3/5
 */

//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
