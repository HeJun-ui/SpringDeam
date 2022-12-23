package com.service;

import com.entity.User;
import com.resp.Result;

/**
 * @author HeJun
 * @date 2022/12/22
 */
public interface UserLoginService {

    Result userLogin(User user);
}
