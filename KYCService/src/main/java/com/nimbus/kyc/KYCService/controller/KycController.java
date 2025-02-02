package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.configuration.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import enumerate.State;

@RestController("kyc")
public class KycController {

    @Autowired
    private ValidationService validationService;

    @GetMapping("/generateToken")
    public ResponseEntity<String> generateToken(@RequestHeader("User-Id") String userId) {

        if (validationService.getState(userId) != State.NONE) {
            return ResponseEntity.badRequest().body("You have already completed this step.");
        }
        validationService.updateState(userId, State.TOKEN_GENERATED);

        return ResponseEntity.ok("Hello World");

    }

}
