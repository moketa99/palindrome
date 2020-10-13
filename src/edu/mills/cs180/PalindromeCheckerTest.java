package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {""})
    void isPalindrome_True_EmptyString(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s), "Wrong string " + s);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AMA", "racecar", "x"})
    void isPalindrome_True_SingleWordPalindrome(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s), "Wrong string " + s);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "abc", "spatula"})
    void isPalindrome_False_SingleWordPalindrome(String s) {
        assertFalse(PalindromeChecker.isPalindrome(s), "Wrong string " + s);
    }
}
