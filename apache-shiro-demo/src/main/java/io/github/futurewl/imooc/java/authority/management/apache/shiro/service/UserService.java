package io.github.futurewl.imooc.java.authority.management.apache.shiro.service;

import io.github.futurewl.imooc.java.authority.management.apache.shiro.model.User;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-17:18:53
 * @version 1.0
 */
public interface UserService {
    User findByUsername(String username);
}
