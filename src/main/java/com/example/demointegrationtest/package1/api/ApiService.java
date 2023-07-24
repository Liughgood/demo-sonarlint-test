package com.example.demointegrationtest.package1.api;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    @Deprecated
    public String hello(){
        return "Hello";
    }
}
