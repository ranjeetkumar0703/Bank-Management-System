package com.blog.config;


import com.blog.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;




@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Not extend SecurityConfigurerAdapter then use @Bean SecurityFilterChain
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.build();
//
//    }

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }


    @Override
    public void configure(HttpSecurity http)throws Exception{
        //in memory authentication - this line code its just changing the form authentication to basic authentication

        //http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();


     http
             .csrf().disable()
             .authorizeRequests()
             .antMatchers(HttpMethod.GET,"/api/**").permitAll()
             .antMatchers(HttpMethod.POST,"/api/auth/**").permitAll()
             .anyRequest().authenticated()
             .and()
             .httpBasic();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(getEncodedPassword());
    }
    @Bean
    public PasswordEncoder getEncodedPassword() {
        return new BCryptPasswordEncoder();
    }

}
