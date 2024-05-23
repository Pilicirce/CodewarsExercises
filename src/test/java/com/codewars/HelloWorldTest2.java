package com.codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest2 {
    @Test
    void testMain() {
      
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        HelloWorld2.main(null);
        String expectedOutput = "Hello World!\n"; // La salida esperada
        assertEquals(expectedOutput, outContent.toString(), "El mensaje de salida no coincide con lo esperado");
    }
}
