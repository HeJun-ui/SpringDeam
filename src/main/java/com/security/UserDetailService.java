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
        //打印执行次数
        System.out.println(++num);

        User user = userService.getUserByname(username);
          //如果输入不存在的用户名，这里应该是进去异常
        if (ObjectUtils.isEmpty(user)) {
            System.out.println("账号不存在 抛出异常");
            throw new RuntimeException("用户不存在");
        }
        return new LoginUser(user);
    }
}
