package com.nimbus.kyc.KYCService.configuration;

import com.nimbus.kyc.KYCService.configuration.ValidationOrderFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, ValidationOrderFilter validationOrderFilter) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())  // Disable CSRF for simplicity (not recommended for production)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/kyc/**").authenticated() // Ensure all endpoints are protected
                        .anyRequest().permitAll()
                )
                .addFilterBefore(validationOrderFilter, UsernamePasswordAuthenticationFilter.class) // Apply custom filter
                .build();
    }
}
