package com.nimbus.kyc.KYCService.service;

import com.nimbus.kyc.KYCService.wrapper.request.PhoneRequest;

public interface KycService {

    public void phoneValidation(PhoneRequest phoneRequest);
    public void phoneOTPValidation();
    public void emailValidation();
    public void emailOTPValidation();
    public void idPicValidation();
    public void curpValidation();
    public void homonimiaValidation();
    public void zipCodeValidation();
    public void addressValidation();
    public void addressLocationValidation();
    public void signatureValidation();
    public void selfieValidation();
}
