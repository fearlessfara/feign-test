package com.example.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service")
public interface ControllerFeignClient {

    @GetMapping("get")
    public String get();

}
