package com.nimbus.kyc.KYCService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KycRegistrerController {

    @GetMapping("/getPhoneNumber")
    public ResponseEntity<String> getPhoneNumber() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/validateOTPPhone")
    public ResponseEntity<String> validateOTPPhone() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getEmail")
    public ResponseEntity<String> getEmail() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/validateOTPEmail")
    public ResponseEntity<String> validateOTPEmail() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getIDPic")
    public ResponseEntity<String> getIDPic() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getCURP")
    public ResponseEntity<String> getCURP() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/verifyHomonimia")
    public ResponseEntity<String> verifyHomonimia() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getZipcode")
    public ResponseEntity<String> getZipcode() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getCustomerAddress")
    public ResponseEntity<String> getCustomerAddress() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/verifyAddressLocation")
    public ResponseEntity<String> verifyAddressLocation() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getSignature")
    public ResponseEntity<String> getSignature() {

        return ResponseEntity.ok("OK");
    }

    @GetMapping("/getSelfie")
    public ResponseEntity<String> getSelfie() {

        return ResponseEntity.ok("OK");
    }

}
