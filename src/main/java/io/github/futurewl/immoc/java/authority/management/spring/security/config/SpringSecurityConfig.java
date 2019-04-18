package io.github.futurewl.immoc.java.authority.management.spring.security.config;

import io.github.futurewl.immoc.java.authority.management.spring.security.coder.MyPasswordEncoder;
import io.github.futurewl.immoc.java.authority.management.spring.security.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    private final MyUserService myUserService;

    public SpringSecurityConfig(MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//        auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("zhangsan").password("zhangsan").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("demo").password("demo").roles("USER");

        // 应用数据库的用户数据
//         auth.userDetailsService(myUserService);

        auth.userDetailsService(myUserService).passwordEncoder(new MyPasswordEncoder());

        // 默认的 JDBC 认证 需要创建 Spring security 提供的 users.ddl 数据库
        auth.jdbcAuthentication().usersByUsernameQuery("").authoritiesByUsernameQuery("").passwordEncoder(new MyPasswordEncoder());

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
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
    }
}
