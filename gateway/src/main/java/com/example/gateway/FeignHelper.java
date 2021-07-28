package com.example.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeignHelper {

    @Autowired
    ControllerFeignClient controllerFeignClient;

    public String get() {
        return controllerFeignClient.get();
    }
}
