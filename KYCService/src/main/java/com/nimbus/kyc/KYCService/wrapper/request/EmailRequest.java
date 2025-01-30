package com.nimbus.kyc.KYCService.wrapper.request;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest implements Serializable {

    private String id;
    private String phone;
    private String token;
}
