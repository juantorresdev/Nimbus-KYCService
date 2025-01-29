package com.nimbus.kyc.KYCService.controller;

import com.nimbus.kyc.KYCService.service.KycPersonalInfoRegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("persona-validation")
public class KycPersonalInfoRegisterController {

    private final KycPersonalInfoRegisterService kycPersonalInfoRegisterService;
    private static final Logger logger = LoggerFactory.getLogger(KycPersonalInfoRegisterController.class);

    public KycPersonalInfoRegisterController(KycPersonalInfoRegisterService kycPersonalInfoRegisterService) {
        this.kycPersonalInfoRegisterService = kycPersonalInfoRegisterService;
    }

    @PostMapping("/idpic")
    public ResponseEntity<String> getIDPic() {

        logger.info("idpic Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/curp")
    public ResponseEntity<String> getCURP() {

        logger.info("curp Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/verifyHomonimia")
    public ResponseEntity<String> verifyHomonimia() {

        logger.info("verifyHomonimia Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/signature")
    public ResponseEntity<String> getSignature() {

        logger.info("signature Endpoint");

        return ResponseEntity.ok("OK");
    }

    @PostMapping("/selfie")
    public ResponseEntity<String> getSelfie() {

        logger.info("selfie Endpoint");

        return ResponseEntity.ok("OK");
    }

}
