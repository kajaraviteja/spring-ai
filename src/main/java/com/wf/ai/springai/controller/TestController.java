package com.wf.ai.springai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ai/health")
    public String healthCheck() {
        return "Server is up and running";
    }
}
