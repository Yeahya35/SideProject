package com.loadbalance.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient("user-loadbalancer")
public class UserServiceController {

    private final RestTemplate restTemplate;

    public UserServiceController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getService")
    public ResponseEntity<?> get(){
        String url = "http://user-loadbalancer/user/main/port";
        String port = "service is currently running on port: " + restTemplate.getForObject(url, String.class);
        return new ResponseEntity<>(port, HttpStatus.ACCEPTED);
    }

}
