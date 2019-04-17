package io.github.futurewl.immoc.java.authority.management.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：Spring Security Demo 启动类
 *
 * @author weilai create by 2019-04-10:10:43
 * @version 1.0
 */
@RestController
@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Spring Boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }


    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/roleAuth")
    public String role() {
        return "admin auth";
    }
}
