package com.nimbus.kyc.KYCService.wrapper.request;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PhoneRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 3608881898314655343L;
    private String id;
    private String phone;
    private String token;
}
