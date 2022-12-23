package com.security;

import com.alibaba.fastjson.JSONObject;
import com.resp.Result;
import com.resp.ResultResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录失败处理逻辑
 *
 */
@Service
public class MyAuthenticationFailedHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        Result result = ResultResponse.getFailResult(e.getMessage() + "  MyAuthenticationFailedHandler");
        httpServletResponse.setContentType("text/json;charset=utf-8");

        httpServletResponse.getWriter().write(String.valueOf(JSONObject.toJSON(result)));
    }
}
