package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex15_Check3and2Test {
    @Test
    public void checkThreeAndTwo() {
        assertEquals(true, new Ex15_Check3and2().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, new Ex15_Check3and2().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, new Ex15_Check3and2().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }
}