package com.codewars.level8kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class Ex4_RockPaperScissorsTest {
    
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Ex4_RockPaperScissors.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Ex4_RockPaperScissors.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Ex4_RockPaperScissors.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Ex4_RockPaperScissors.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Ex4_RockPaperScissors.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Ex4_RockPaperScissors.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Ex4_RockPaperScissors.rps("scissors", "scissors"));
        assertEquals("Draw!", Ex4_RockPaperScissors.rps("paper", "paper"));
        assertEquals("Draw!", Ex4_RockPaperScissors.rps("rock", "rock"));
    }
    
}