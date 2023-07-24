package com.example.demointegrationtest.package1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

// java:S5786
@SpringBootTest
public class SecondTest {
    @Autowired
    private First first;
    @Test
    public void hello() {
        assertEquals("hello", first.hello());
    }
}
