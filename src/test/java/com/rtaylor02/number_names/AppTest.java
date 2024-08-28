package com.rtaylor02.number_names;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {
    @InjectMocks
    private App systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new App();
    }

    /**
     * Canary test: framework test
     */
    @Test
    void shouldJustWork() {
        assertEquals(1, 1);
        assertTrue(true);
        assertFalse(false);
    }

    /**
     * GIVEN a number 1 as input
     * WHEN the giveNumberText() method is run
     * THEN 'one' should be output
     */
    @Test
    void shouldOutputOne() {
        // ARRANGE
        String expected = "one";

        // ACT
        String actual = systemUnderTest.giveNumberText(1);

        // ASSERT
        assertEquals(expected, actual);
    }

    /**
     * GIVEN a number 10 as input
     * WHEN the giveNumberText() method is run
     * THEN 'ten' should be output
     */
    @Test
    void shouldOutputTen() {
        // ARRANGE
        String expected = "ten";

        // ACT
        String actual = systemUnderTest.giveNumberText(10);

        // ASSERT
        assertEquals(expected, actual);
    }
}