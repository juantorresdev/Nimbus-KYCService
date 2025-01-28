package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("address-validation")
public class KycAddressRegisterController {

    private KycService kycService;
    private static final Logger logger = LoggerFactory.getLogger(KycAddressRegisterController.class);

    public KycAddressRegisterController(KycService kycService) {
        this.kycService = kycService;
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
