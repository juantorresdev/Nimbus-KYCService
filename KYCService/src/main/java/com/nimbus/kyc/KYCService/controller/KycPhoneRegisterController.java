package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycService;
import com.nimbus.kyc.KYCService.wrapper.request.PhoneRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("phone-validation")
public class KycPhoneRegisterController {

    private KycService kycService;
    private static final Logger logger = LoggerFactory.getLogger(KycPhoneRegisterController.class);

    public KycPhoneRegisterController(KycService kycService) {
        this.kycService = kycService;
    }

    @PostMapping("/phone-number")
    public ResponseEntity<String> getPhoneNumber(@RequestBody PhoneRequest phoneRequest) {

        logger.info("phone-number Endpoint");

        if(phoneRequest != null) {
            kycService.phoneValidation(phoneRequest);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/otp-phone")
    public ResponseEntity<String> validateOTPPhone() {

        logger.info("otp-phone Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PutMapping("/phone-number")
    public ResponseEntity<String> updatePhoneNumber(@RequestBody PhoneRequest phoneRequest) {

        logger.info("phone-number Endpoint");

        if(phoneRequest != null) {
            kycService.phoneValidation(phoneRequest);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("OK");
    }
}
