package com.example.demosonarlinttest.package1.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceTest {

    @Autowired
    ApiService apiService;
    @Test
    void hello() {
        assertEquals("hello", apiService.hello());
    }
}
