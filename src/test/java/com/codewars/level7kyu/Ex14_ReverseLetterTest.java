package com.codewars.level7kyu;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runners.JUnit4;

public class Ex14_ReverseLetterTest {
    @Test
    public void reverseLetter() {
        doTest("krishan", "nahsirk");
        doTest("ultr53o?n", "nortlu");
        doTest("ab23c", "cba");
        doTest("krish21an", "nahsirk");
    }
    private void doTest(final String str, final String expected) {
        assertEquals(expected, Ex14_ReverseLetter.reverseLetter(str));
    }
}
