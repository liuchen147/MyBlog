package com.lc.dao;

import com.lc.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liuchen
 * @date 2020/3/21 -12:24
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
