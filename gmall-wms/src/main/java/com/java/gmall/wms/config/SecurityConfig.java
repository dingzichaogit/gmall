package com.java.gmall.wms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author dzc
 * @version 1.0
 * @date 2021/9/9 17:05
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests().antMatchers("/**").permitAll();
         http.csrf().disable();
    }
}
