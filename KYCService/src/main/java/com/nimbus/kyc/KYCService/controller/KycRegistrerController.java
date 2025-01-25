package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycService;
import com.nimbus.kyc.KYCService.wrapper.request.PhoneRequest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KycRegistrerController {

    private KycService kycService;
    private static final Logger logger = LoggerFactory.getLogger(KycRegistrerController.class);

    public KycRegistrerController(KycService kycService) {
        this.kycService = kycService;
    }

    @PostMapping("/getPhoneNumber")
    public ResponseEntity<String> getPhoneNumber(@RequestBody PhoneRequest phoneRequest) {

        logger.info("getPhoneNumber");

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

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getEmail")
    public ResponseEntity<String> getEmail() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/validateOTPEmail")
    public ResponseEntity<String> validateOTPEmail() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getIDPic")
    public ResponseEntity<String> getIDPic() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getCURP")
    public ResponseEntity<String> getCURP() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/verifyHomonimia")
    public ResponseEntity<String> verifyHomonimia() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getZipcode")
    public ResponseEntity<String> getZipcode() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getCustomerAddress")
    public ResponseEntity<String> getCustomerAddress() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/verifyAddressLocation")
    public ResponseEntity<String> verifyAddressLocation() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getSignature")
    public ResponseEntity<String> getSignature() {

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/getSelfie")
    public ResponseEntity<String> getSelfie() {

        return ResponseEntity.ok("OK");
    }

}
