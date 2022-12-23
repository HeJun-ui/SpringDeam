package com.security;

import com.util.Md5Util;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Security加密方式
 * 实现类
 *
 */
@Service
public class PasswordEncoderImpl implements PasswordEncoder {


    @Override
    public String encode(CharSequence charSequence) {
        return Md5Util.md5((String) charSequence);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(Md5Util.md5((String) charSequence));
    }
}
