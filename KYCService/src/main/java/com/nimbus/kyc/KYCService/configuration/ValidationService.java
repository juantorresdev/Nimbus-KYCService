package com.nimbus.kyc.KYCService.configuration;

import enumerate.State;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class ValidationService {

    private final ConcurrentHashMap<String, State> userStateMap = new ConcurrentHashMap<>();

    public State getState(String userId) {
        return userStateMap.getOrDefault(userId, State.NONE);
    }

    public void updateState(String userId, State newState) {
        userStateMap.put(userId, newState);
    }

}
