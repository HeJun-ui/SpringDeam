package com.security;

import com.alibaba.fastjson.JSON;
import com.resp.Result;
import com.resp.ResultResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 验证失败处理逻辑
 *

 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        response.setContentType("text/json;charset=utf-8");
        Result failResult = ResultResponse.getFailResult("AuthenticationEntryPointImpl认证失败,账号或密码无效");
        String json = JSON.toJSONString(failResult);
        PrintWriter writer = response.getWriter();
        writer.write(json);
        writer.flush();
        writer.close();
    }
}