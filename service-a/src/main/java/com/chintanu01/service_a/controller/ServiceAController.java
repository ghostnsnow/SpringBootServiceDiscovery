package com.chintanu01.service_a.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServiceAController {

    @Value("${service-b.url}")
    private String url;

    @GetMapping("/checkFeign")
    public String checkFeign() {

        System.out.println("Inside Service A's checkFeign()");
        System.out.println("Service B URL : " + url);

        return url;
    }

}
