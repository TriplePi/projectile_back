package com.triplepi.projectile.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/health")
public class HealthController {

    @GetMapping
    public Boolean checkHealth() {
        return true;
    }
}
