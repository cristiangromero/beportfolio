
package com.portfolio.beportfolio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    	@Override
	protected void configure(HttpSecurity http) throws Exception {
            http
                .csrf().disable()
                .authorizeRequests()
               /* .antMatchers(HttpMethod.GET,"/publicapi/**").permitAll()
                .antMatchers(HttpMethod.OPTIONS,"/publicapi/**").permitAll()
                .antMatchers("/publicapi/**").permitAll()
                .anyRequest().authenticated()*/
                .anyRequest().permitAll()
                .and().cors()
                //.and().formLogin()
                .and()
                .httpBasic();
	}
}
