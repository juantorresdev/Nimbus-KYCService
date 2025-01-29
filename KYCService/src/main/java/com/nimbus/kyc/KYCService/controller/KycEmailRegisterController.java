package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycEmailRegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("email-validation")
public class KycEmailRegisterController {

    private final KycEmailRegisterService emailRegisterService;
    private static final Logger logger = LoggerFactory.getLogger(KycEmailRegisterController.class);

    public KycEmailRegisterController(KycEmailRegisterService emailRegisterService) {
        this.emailRegisterService = emailRegisterService;
    }

    @PostMapping("/email")
    public ResponseEntity<String> getEmail() {

        logger.info("get email Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/otp-email")
    public ResponseEntity<String> validateOTPEmail() {

        logger.info("otp-email Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PutMapping("/email")
    public ResponseEntity<String> updateEmail() {

        logger.info("update email Endpoint");

        return ResponseEntity.ok("OK");
    }
}
