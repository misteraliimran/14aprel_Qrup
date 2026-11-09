package com.example.erukea_server;

import org.jvnet.hk2.annotations.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @CircuitBreaker(
        name = "computerService",
        fallbackMethod = "computerFallback"
    )
    public String getComputers() {

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(
            "http://localhost:8001/computers",
            String.class
        );
    }

    public String computerFallback(Exception e) {
        return "Computer service hal-hazırda işləmir!";
    }
}