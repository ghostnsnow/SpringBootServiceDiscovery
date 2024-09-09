package com.chintanu01.service_b.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-a")
public interface ServiceAFeignClient {

    @GetMapping("/checkFeign")
    public String checkFeign();
}
