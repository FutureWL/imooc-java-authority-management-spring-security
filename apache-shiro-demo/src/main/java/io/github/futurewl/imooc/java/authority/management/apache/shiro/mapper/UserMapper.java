package io.github.futurewl.imooc.java.authority.management.apache.shiro.mapper;

import io.github.futurewl.imooc.java.authority.management.apache.shiro.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-17:18:53
 * @version 1.0
 */
public interface UserMapper {

    User findByUsername(@Param("usernmae") String username);

}
