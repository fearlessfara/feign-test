package com.example.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @Autowired
    SimpleClientHelper simpleClientHelper;

    @GetMapping("get")
    public String get() {
        String serviceHostname = simpleClientHelper.get();
        log.info("Called service with hostname: {}", serviceHostname);
        return serviceHostname;
    }
}
