package com.example.gateway;

import feign.FeignException;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Slf4j
@Component
public class SimpleClientHelper {

    @Autowired
    SimpleClient simpleClient;

    //fallback doesn't work
    @Retry(name = "service", fallbackMethod = "fallback")
    public String get() {
        log.info("timestamp: {}", Instant.now());
        return simpleClient.get();
    }

    public String fallback(Exception e) {
        log.error("fallback method called");
        return "fallback";
    }

    public String fallback(FeignException.ServiceUnavailable e) {
        log.error("fallback method called, exception: {}", e);
        return "fallback";
    }

}
