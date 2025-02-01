package com.nimbus.kyc.KYCService.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OTPRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String id;
    private String otp;

}
