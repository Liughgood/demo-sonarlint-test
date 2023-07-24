package com.example.demosonarlinttest.package1.api2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ApiSecondServiceTest {

    @InjectMocks
    private ApiSecondService apiSecondService;

    @Test
    void hello() {
        // can't find java:S5785 issue
        assertTrue("Hello".equals(apiSecondService.hello()));
    }

}
