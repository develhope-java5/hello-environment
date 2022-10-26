package com.develhope.helloenvironment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @Value("${messages.hello}")
    private String helloMessage;

    @GetMapping
    public String getHello() {
        return helloMessage;
    }
}
