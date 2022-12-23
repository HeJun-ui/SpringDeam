package com.controller;

import com.entity.User;
import com.resp.Result;
import com.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {
    @Autowired
    UserLoginService userLoginService;

    @RequestMapping(method = RequestMethod.POST, value = "/doLogin")
    public ResponseEntity userLogin(@Validated @RequestBody User user) {

        Result result = userLoginService.userLogin(user);

        return ResponseEntity.ok(result);
    }
}
