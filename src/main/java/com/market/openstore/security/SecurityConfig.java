package com.market.openstore.security;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecurityConfig //extends WebSecurityConfigurerAdapter//
 {
/*
    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsServiceImp();
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setPasswordEncoder(passwordEncoder());
        authProvider.setUserDetailsService(userDetailsService());
        return authProvider;
    }

    @Override
    protected void configure (AuthenticationManagerBuilder auth ) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    protected void configure (HttpSecurity http) throws Exception{
        http.formLogin().loginPage("/login") ;
        http.authorizeRequests().antMatchers("user/*").hasRole("USER") ;
        http.authorizeRequests().antMatchers("admin/*").hasRole("ADMIN") ;

    }

 */
}
