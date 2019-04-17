package io.github.futurewl.imooc.java.authority.management.apache.shiro.service.impl;

import io.github.futurewl.imooc.java.authority.management.apache.shiro.mapper.UserMapper;
import io.github.futurewl.imooc.java.authority.management.apache.shiro.model.User;
import io.github.futurewl.imooc.java.authority.management.apache.shiro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-17:18:54
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
