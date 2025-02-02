package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycEmailRegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("kyc-address")
public class KycAddressRegisterController {

    private final KycEmailRegisterService KycEmailRegisterService;
    private static final Logger logger = LoggerFactory.getLogger(KycAddressRegisterController.class);

    public KycAddressRegisterController(com.nimbus.kyc.KYCService.service.KycEmailRegisterService kycEmailRegisterService) {
        KycEmailRegisterService = kycEmailRegisterService;
    }

    @PostMapping("/zipcode")
    public ResponseEntity<String> getZipcode() {

        logger.info("zipcode Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/customer-address")
    public ResponseEntity<String> getCustomerAddress() {

        logger.info("customer-address Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/address-location")
    public ResponseEntity<String> verifyAddressLocation() {

        logger.info("address-location Endpoint");

        return ResponseEntity.ok("OK");
    }
}
