package com.example.demointegrationtest.package1.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void hello(){
        assertEquals("Hello", apiService.hello());
    }
}
