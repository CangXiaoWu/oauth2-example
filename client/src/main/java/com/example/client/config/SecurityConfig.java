package com.example.client.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.stereotype.Component;

/**
 * @author xuan
 * @create 2018-10-20 20:51
 **/
@Component
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .and()
                .requestMatchers().anyRequest()
                .and()
                .authorizeRequests()
                .antMatchers("/user/**").authenticated() // 访问user/** 端点需要登录后
                .and()
                .formLogin().successForwardUrl("/index") // 登录成功后重定向到/index端点
                .and()
                .logout().logoutUrl("/logout").permitAll()
                .logoutSuccessUrl("/");

    }

}
