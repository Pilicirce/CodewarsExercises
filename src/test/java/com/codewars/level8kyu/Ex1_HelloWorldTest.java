package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex1_HelloWorldTest {
    @Test
    void testGetGreeting() {
        assertEquals("Hello World!", Ex1_HelloWorld.getGreeting());
    }
}
