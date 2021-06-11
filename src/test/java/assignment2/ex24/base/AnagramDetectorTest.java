package assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

  @Test
    void isAnagram_returns_true_for_anagram_lowercase() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("difo", "fido");

        //then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagram_OneUpper() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("DIFO", "fido");

        //then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagram_RandomUpper() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("RaCeCaR", "CaRrAcE");

        //then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagram_OneUpper() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("GREAT", "good");

        //then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagram_RandomUpper() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("GrEaT", "GoOd");

        //then
        assertFalse(actual);
    }


    @Test
    void isAnagram_returns_false_for_nonanagram() {
        //given
        AnagramDetector detector = new AnagramDetector();

        //when
        boolean actual = detector.isAnagram("difo", "god");

        //then
        assertFalse(actual);
    }
}