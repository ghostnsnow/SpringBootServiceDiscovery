package com.chintanu01.service_b.controller;

import com.chintanu01.service_b.clients.ServiceAFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Value("${service-a.url}")
    private String serviceAurl;

    @Autowired
    ServiceAFeignClient serviceAFeignClient;

    @GetMapping("/checkFeign")
    public String checkFeign() {

        System.out.println("Inside Service B's checkFeign()");
        System.out.println("Service A's URL through Config Server: " + serviceAurl);

        String serviceBurl = serviceAFeignClient.checkFeign();

        System.out.println("Service B's URL through Eureka Server/Service-A Feign Client: " + serviceBurl);

        return serviceBurl;
    }
}
