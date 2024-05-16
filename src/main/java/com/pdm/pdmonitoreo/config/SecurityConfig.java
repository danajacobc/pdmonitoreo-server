package com.pdm.pdmonitoreo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    private static final String[] PUBLIC_RESOURCES = { "/", "/.well-known/**"};
    private static final String[] ADMIN_RESOURCES = { "/plantas/**", "/pais/**", "/user/**", "/.well-known/**"}; ;
    private static final String LOGIN_RESOURCE = "/login";

}
