package com.rtaylor02.abc_problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        assertTrue(systemUnderTest.canMakeWord_solution("A", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
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
        assertTrue(systemUnderTest.canMakeWord_solution("BARK", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
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
        assertFalse(systemUnderTest.canMakeWord_solution("BOOK", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
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
        assertTrue(systemUnderTest.canMakeWord_solution("TREAT", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
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
        assertFalse(systemUnderTest.canMakeWord_solution("COMMON", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
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
        assertTrue(systemUnderTest.canMakeWord_solution("SQUAD", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
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
        assertTrue(systemUnderTest.canMakeWord_solution("CONFUSE", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
    }

    // GIVEN an empty String
    // WHEN it is checked using canMakeWord() method
    // THEN it should return true
    @Test
    void shouldReturnTrue_WhenAnEmptyStringIsPassed() {
        // ARRANGE

        // ACT

        // ASSERT
        assertTrue(systemUnderTest.canMakeWord(""));
        assertTrue(systemUnderTest.canMakeWord_solution("", Arrays.asList(
                "BO", "XK", "DQ", "CP", "NA",
                "GT", "RE", "TG", "QD", "FS",
                "JW", "HU", "VI", "AN", "OB",
                "ER", "FS", "LY", "PC", "ZM")));
    }
}
