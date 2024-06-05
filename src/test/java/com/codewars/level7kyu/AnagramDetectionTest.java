package com.codewars.level7kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AnagramDetectionTest {
    @Test
    public void exampleTests() {
      AnagramDetection k = new AnagramDetection();
      
      assertEquals(true, AnagramDetection.isAnagram("foefet", "toffee"));
      assertEquals(true, AnagramDetection.isAnagram("Buckethead", "DeathCubeK"));
      assertEquals(true, AnagramDetection.isAnagram("Twoo", "Woot"));
      assertEquals(false, AnagramDetection.isAnagram("apple", "pale"));
    }
  
}
