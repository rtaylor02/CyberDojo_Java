package com.rtaylor02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    App systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new App();
    }

    // GIVEN a word "A"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return true as it is possible to make the word
    @Test
    void shouldReturnTrue_WhenAIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertTrue(systemUnderTest.canMakeWord("A"));
    }

    // GIVEN a word "BARK"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return true as it is possible to make the word
    @Test
    void shouldReturnTrue_WhenBARKIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertTrue(systemUnderTest.canMakeWord("BARK"));
    }

    // GIVEN a word "BOOK"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return false as it is possible to make the word
    @Test
    void shouldReturnFalse_WhenBOOKIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertFalse(systemUnderTest.canMakeWord("BOOK"));
    }

    // GIVEN a word "TREAT"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return true as it is possible to make the word
    @Test
    void shouldReturnTrue_WhenTREATIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertTrue(systemUnderTest.canMakeWord("TREAT"));
    }

    // GIVEN a word "COMMON"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return false as it is possible to make the word
    @Test
    void shouldReturnFalse_WhenCOMMONIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertFalse(systemUnderTest.canMakeWord("COMMON"));
    }

    // GIVEN a word "SQUAD"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return true as it is possible to make the word
    @Test
    void shouldReturnTrue_WhenSQUADIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertTrue(systemUnderTest.canMakeWord("SQUAD"));
    }

    // GIVEN a word "CONFUSE"
    // WHEN it is checked using canMakeWord() method
    // THEN it should return true as it is possible to make the word
    @Test
    void shouldReturnTrue_WhenCONFUSEIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertTrue(systemUnderTest.canMakeWord("CONFUSE"));
    }
}
