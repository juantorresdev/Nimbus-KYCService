package com.nimbus.kyc.KYCService.configuration;

import enumerate.State;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Map;

@Component
public class ValidationOrderFilter extends OncePerRequestFilter {

    @Autowired
    private ValidationService validationService;

    // Define the allowed order of requests
    private static final Map<String, State> REQUIRED_STATES = Map.ofEntries(
            Map.entry("/kyc/generateToken", State.NONE),
            Map.entry("/kyc-phone/phone-number", State.TOKEN_GENERATED),
            Map.entry("/kyc-phone/otp-phone", State.PHONE_RECEIVED),
            Map.entry("/kyc-email/email", State.PHONE_OTP_VALIDATED),
            Map.entry("/kyc-email/otp-email", State.EMAIL_RECEIVED),
            Map.entry("/kyc-persona/idpic", State.EMAIL_OTP_VALIDATED),
            Map.entry("/kyc-persona/curp", State.ID_RECEIVED),
            Map.entry("/kyc-persona/verifyHomonimia", State.CURP_RECEIVED),
            Map.entry("/kyc-address/zipcode", State.CURP_VALIDATED),
            Map.entry("/kyc-address/customer-address", State.ZIPCODE_RECEIVED),
            Map.entry("/kyc-address/address-location", State.ADDRESS_RECEIVED),
            Map.entry("/kyc-persona/signature", State.SIGNATURE_RECEIVED),
            Map.entry("/kyc-persona/selfie", State.SELFIE_RECEIVED)
    );

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        String userId = request.getHeader("User-Id");

        if (userId == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "User-Id header is required");
            return;
        }

        String uri = request.getRequestURI();
        State currentState = validationService.getState(userId);

        // If the endpoint requires a specific previous state and the user is not in that state, reject the request
        if (REQUIRED_STATES.containsKey(uri) && currentState != REQUIRED_STATES.get(uri)) {
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Invalid request order");
            return;
        }

        filterChain.doFilter(request, response);
    }

}
