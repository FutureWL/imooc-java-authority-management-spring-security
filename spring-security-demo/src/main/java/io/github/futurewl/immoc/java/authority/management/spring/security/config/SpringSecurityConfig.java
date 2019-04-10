package io.github.futurewl.immoc.java.authority.management.spring.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 功能描述：Spring Security 配置
 *
 * @author weilai create by 2019-04-10:10:51
 * @version 1.0
 */
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("zhangsan").password("zhangsan").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 根目录不需要授权
                .antMatchers("/").permitAll()
                // 所有的请求都需要授权
                .anyRequest().authenticated()
                .and()
                // 允许注销
                .logout().permitAll()
                .and()
                // 开启登陆表单
                .formLogin();
        http.csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/js/**",
                "/css/**",
                "/images/**"
        );
    }
}
