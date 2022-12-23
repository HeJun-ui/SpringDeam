package com.service.impl;

import com.entity.LoginUser;
import com.entity.User;
import com.resp.Result;
import com.resp.ResultResponse;
import com.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserLoginImpl implements UserLoginService {


    @Autowired

    AuthenticationManager authenticationManager;

//    @Autowired
//    RedisUtil redisUtil;

    @Override
    public Result userLogin(User user) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken
                (user.getUsername(), user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if (ObjectUtils.isEmpty(authenticate)) {
            throw new RuntimeException("账号密码错误，请检查账号密码");
        }
        LoginUser user1 = (LoginUser) authenticate.getPrincipal();
        String uid = user1.getUser().getUid().toString();
//        String token = JwtUtil.createJWT(uid);
        String token = null;
//        redisUtil.set("login:" + uid, user1);
        Map map = new HashMap();
        map.put("token", token);
        return ResultResponse.getSuccessandMessage(map, "登录成功");
    }
}
