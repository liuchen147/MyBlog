package com.lc.service;

import com.lc.dao.UserRepository;
import com.lc.po.User;
import com.lc.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuchen
 * @date 2020/3/21 -12:21
 */
@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password) );
        return user;
    }
}
