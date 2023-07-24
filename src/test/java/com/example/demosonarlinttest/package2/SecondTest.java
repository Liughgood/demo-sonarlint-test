package com.example.demosonarlinttest.package2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class SecondTest {
    @InjectMocks
    private Second second;
    @Test
    public void hello() {
        assertEquals("hello", second.hello());
    }
}
