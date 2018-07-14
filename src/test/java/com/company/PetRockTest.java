package com.company;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    private PetRock rocky ;
    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
            rocky = new PetRock("Rocky");
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
            rocky = null;
    }

    @org.junit.jupiter.api.Test
    public void getName() {
            assertEquals("Rocky", rocky.getName());
        }

    @org.junit.jupiter.api.Test
    public void isHappy() {assertFalse(rocky.isHappy());
    }

    @org.junit.jupiter.api.Test
    public void playWithRock() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}