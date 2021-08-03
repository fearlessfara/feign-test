package com.example.gateway;

import org.springframework.stereotype.Component;

@Component
public class RetryFallback {

    //this should be the fallback method for the retry
    public String fallback() {
        return "fallback you bastard";
    }
}
