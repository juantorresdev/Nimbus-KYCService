package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycService;
import com.nimbus.kyc.KYCService.wrapper.request.PhoneRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KycRegisterController {

    private KycService kycService;
    private static final Logger logger = LoggerFactory.getLogger(KycRegisterController.class);

    public KycRegisterController(KycService kycService) {
        this.kycService = kycService;
    }

    @PostMapping("/getPhoneNumber")
    public ResponseEntity<String> getPhoneNumber(@RequestBody PhoneRequest phoneRequest) {

        logger.info("getPhoneNumber Endpoint");

        if(phoneRequest != null) {
            kycService.phoneValidation(phoneRequest);
        }
        else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/validateOTPPhone")
    public ResponseEntity<String> validateOTPPhone() {

        logger.info("validateOTPPhone Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getEmail")
    public ResponseEntity<String> getEmail() {

        logger.info("getEmail Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/validateOTPEmail")
    public ResponseEntity<String> validateOTPEmail() {

        logger.info("validateOTPEmail Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getIDPic")
    public ResponseEntity<String> getIDPic() {

        logger.info("getIDPic Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getCURP")
    public ResponseEntity<String> getCURP() {

        logger.info("getCURP Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/verifyHomonimia")
    public ResponseEntity<String> verifyHomonimia() {

        logger.info("verifyHomonimia Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getZipcode")
    public ResponseEntity<String> getZipcode() {

        logger.info("getZipcode Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getCustomerAddress")
    public ResponseEntity<String> getCustomerAddress() {

        logger.info("getCustomerAddress Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/verifyAddressLocation")
    public ResponseEntity<String> verifyAddressLocation() {

        logger.info("verifyAddressLocation Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getSignature")
    public ResponseEntity<String> getSignature() {

        logger.info("getSignature Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getSelfie")
    public ResponseEntity<String> getSelfie() {

        logger.info("getSelfie Endpoint");

        return ResponseEntity.ok("OK");
    }

}
