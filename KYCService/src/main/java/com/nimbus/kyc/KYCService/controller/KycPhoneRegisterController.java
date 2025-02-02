package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycPhoneRegisterService;
import com.nimbus.kyc.KYCService.wrapper.request.PhoneRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("kyc-phone")
public class KycPhoneRegisterController {

    private final KycPhoneRegisterService kycPhoneRegisterService;
    private static final Logger logger = LoggerFactory.getLogger(KycPhoneRegisterController.class);

    public KycPhoneRegisterController(KycPhoneRegisterService kycPhoneRegisterService) {
        this.kycPhoneRegisterService = kycPhoneRegisterService;
    }

    @PostMapping("/phone-number")
    public ResponseEntity<String> getPhoneNumber(@RequestBody PhoneRequest phoneRequest) {

        logger.info("phone-number Endpoint");

        if(phoneRequest != null) {
            kycPhoneRegisterService.phoneValidation(phoneRequest);
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

}
