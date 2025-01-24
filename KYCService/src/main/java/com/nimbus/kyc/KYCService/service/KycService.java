package com.nimbus.kyc.KYCService.service;

import com.nimbus.kyc.KYCService.wrapper.request.PhoneRequest;

public interface KycService {

    public void phoneValidation(PhoneRequest phoneRequest);
    public void phoneOTPValidation();
}
