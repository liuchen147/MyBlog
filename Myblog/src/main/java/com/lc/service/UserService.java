package com.lc.service;

import com.lc.po.User;

/**
 * @author liuchen
 * @date 2020/3/21 -12:20
 */
public interface UserService {

    User checkUser(String username,String password);
}
