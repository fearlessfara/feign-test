package com.example.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service")
public interface SimpleClient {

    @GetMapping("get")
    public String get();
}
