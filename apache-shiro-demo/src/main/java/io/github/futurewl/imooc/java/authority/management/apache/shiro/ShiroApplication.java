package io.github.futurewl.imooc.java.authority.management.apache.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-04-17:18:36
 * @version 1.0
 */
@MapperScan(basePackages = {"io.github.futurewl.imooc.java.authority.management.apache.shiro.mapper"})
@SpringBootApplication
public class ShiroApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class, args);
    }
}
