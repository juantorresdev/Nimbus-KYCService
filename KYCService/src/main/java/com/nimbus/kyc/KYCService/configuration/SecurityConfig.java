package com.nimbus.kyc.KYCService.configuration;

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
                        .requestMatchers("/kyc/generateToken").permitAll()
                        .requestMatchers("/kyc-phone/phone-number","/kyc-phone/otp-phone","/kyc-email/email","/kyc-email/otp-email","/kyc-persona/idpic","/kyc-persona/curp","/kyc-persona/verifyHomonimia","/kyc-address/zipcode","/kyc-address/customer-address","/kyc-address/address-location","/kyc-persona/signature","/kyc-persona/selfie")
                        .authenticated()
                )
                .addFilterBefore(validationOrderFilter, UsernamePasswordAuthenticationFilter.class) // Apply custom filter
                .build();
    }
}
