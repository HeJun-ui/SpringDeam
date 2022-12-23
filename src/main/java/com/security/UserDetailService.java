package com.security;

import com.entity.LoginUser;
import com.entity.User;
import com.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * 自定义验证逻辑
 *
 */
@Slf4j
@Component
public class UserDetailService implements UserDetailsService {
    @Autowired
    UserService userService;


    private static int num = 0;

    @Override
    public UserDetails loadUserByUsername(String username) {
        System.out.println(++num);
        User user;

        //邮箱登录逻辑
            user = userService.getUserByname(username);

        if (ObjectUtils.isEmpty(user)) {
            System.out.println("账号不存在 抛出异常");
            throw new RuntimeException("用户不存在");
        }
        return new LoginUser(user);
    }
}
