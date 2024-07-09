package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex8_AnagramDetectionTest {
    @Test
    public void exampleTests() {
     // Ex8_AnagramDetection k = new Ex8_AnagramDetection();
      
      assertEquals(true, Ex8_AnagramDetection.isAnagram("foefet", "toffee"));
      assertEquals(true, Ex8_AnagramDetection.isAnagram("Buckethead", "DeathCubeK"));
      assertEquals(true, Ex8_AnagramDetection.isAnagram("Twoo", "Woot"));
      assertEquals(false, Ex8_AnagramDetection.isAnagram("apple", "pale"));
    }
  
}
