package com.example.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class Controller {

    @GetMapping("/get")
    public String get() throws UnknownHostException {
        return InetAddress.getLocalHost().getCanonicalHostName();
    }
}
