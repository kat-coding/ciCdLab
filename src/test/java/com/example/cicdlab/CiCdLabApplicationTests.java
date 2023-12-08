package com.example.cicdlab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CiCdLabApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void getSides() {
        Dice test = new Dice(6, "blue");
        assertEquals(6, test.getSides());
    }

    @Test
    void getColor() {
        Dice test = new Dice(6, "blue");
        assertEquals("blue", test.getColor());
    }

    @Test
    void roll() {
        Dice test = new Dice(6, "blue");
        assertTrue(test.roll() > 0 && test.roll() <= 6);
    }

    @Test
    void rollMany() {
        Dice test = new Dice(6, "blue");
        int rolls = 6;
        int [] manyRolls = test.rollMany(rolls);
        assertEquals(manyRolls.length, rolls);
    }

    @Test
    void testToString() {
        Dice test = new Dice(6, "blue");
        String expected = "A 6 sided die";
        assertEquals(expected, test.toString());
    }
}
