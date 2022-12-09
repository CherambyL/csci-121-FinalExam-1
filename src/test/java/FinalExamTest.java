import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalExamTest {

    @Test
    @DisplayName("[1] test cstring_null")
    void cstring_null() {
        char[] actual = FinalExam.cstring(null);
        assertNull(actual,"Expected a null!");
    }

    @Test
    @DisplayName("[1] test cstring_empty_string")
    void cstring_empty_string() {
        char[] actual = FinalExam.cstring("");
        char[] expected = new char[1];
        expected[0]='\0';
        assertArrayEquals(expected, actual, "Expected a string containing a \0 ontly!");
    }

    @Test
    @DisplayName("[8] test cstring")
    void cstring() {
        String[] testStrings = {"hello","machine","lazy", "hola"};
        char[][] expecteds = {{'h','e','l','l','o', '\0'},{'m','a','c','h','i','n','e','\0'},
                {'l','a','z','y', '\0'}, {'h','o','l','a','\0'}};
        for(int i = 0; i < testStrings.length; i++) {
            char[] actual = FinalExam.cstring(testStrings[i]);
            char[] expected = expecteds[i];
            assertArrayEquals(expected, actual, "Expected " + expected + "\nActual " + actual);
        }
    }
}