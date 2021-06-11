package assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void Very_Weak_Password() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("12345");
        int expected = 1;

        assertEquals(expected,actual);
    }
    @Test
    void Very_Weak_Password_2() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("54799");
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void Weak_Password() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("abcdef");
        int expected = 2;

        assertEquals(expected, actual);
    }
    @Test
    void Weak_Password_2() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("hsgtss");
        int expected = 2;

        assertEquals(expected, actual);
    }
    @Test
    void Strong_Password() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("abc123xyz");
        int expected = 3;

        assertEquals(expected, actual);
    }
    @Test
    void Strong_Password_2() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("wow867wow");
        int expected = 3;

        assertEquals(expected, actual);
    }
    @Test
    void Very_Strong_Password() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("1337h@xor!");
        int expected = 4;

        assertEquals(expected, actual);
    }
    @Test
    void Very_Strong_Password_2() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("88hh^^%%v");
        int expected = 4;

        assertEquals(expected, actual);
    }
    @Test
    void Unusaul_Password() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("abcdefghijk");
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void Unusaul_Password_2() {
        PasswordChecker pass = new PasswordChecker();

        int actual = pass.passwordValidator("123456789");
        int expected = 0;

        assertEquals(expected, actual);
    }
}