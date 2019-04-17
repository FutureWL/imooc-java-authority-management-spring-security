package io.github.futurewl.immoc.java.authority.management.spring.security.coder;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 功能描述：加密
 *
 * @author weilai create by 2019-04-17:17:32
 * @version 1.0
 */
public class MyPasswordEncoder implements PasswordEncoder {

    public static final String SALT = "123456";

    @Override
    public String encode(CharSequence rawPassword) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.encodePassword(rawPassword.toString(), SALT);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.isPasswordValid(encodedPassword, rawPassword.toString(), SALT);
    }
}
