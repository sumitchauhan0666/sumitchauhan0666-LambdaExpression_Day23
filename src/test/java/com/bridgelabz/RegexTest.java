package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexTest {
    public boolean mailregex(String mailID) {
        String regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailID);
        return matcher.matches();
    }

    @Test
    public void Mailcheck1() {
        RegexTest test = new RegexTest();
        String check = "1.abc@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck2() {
        RegexTest test = new RegexTest();
        String check = "2.abc-100@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck3() {
        RegexTest test = new RegexTest();
        String check = "3.abc.100@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck4() {
        RegexTest test = new RegexTest();
        String check = "2.abc111@abc.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck5() {
        RegexTest test = new RegexTest();
        String check = "4.abc-100@abc.net";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck6() {
        RegexTest test = new RegexTest();
        String check = "5.abc.100@abc.com.au";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck7() {
        RegexTest test = new RegexTest();
        String check = "6.abc@1.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck8() {
        RegexTest test = new RegexTest();
        String check = "7.abc@gmail.com.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck9() {
        RegexTest test = new RegexTest();
        String check = "8.abc+100@gmail.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck10() {
        RegexTest test = new RegexTest();
        String check = "abc";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck11() {
        RegexTest test = new RegexTest();
        String check = "abc@.com.my";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck12() {
        RegexTest test = new RegexTest();
        String check = "abc123@gmail.a";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck13() {
        RegexTest test = new RegexTest();
        String check = "abc123@.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck14() {
        RegexTest test = new RegexTest();
        String check = "abc123@.com.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck15() {
        RegexTest test = new RegexTest();
        String check = ".abc@abc.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck16() {
        RegexTest test = new RegexTest();
        String check = "abc()*@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck17() {
        RegexTest test = new RegexTest();
        String check = "abc@gmail.com.aa.au";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck18() {
        RegexTest test = new RegexTest();
        String check = "abc@%*.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck19() {
        RegexTest test = new RegexTest();
        String check = "abc..2002@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck20() {
        RegexTest test = new RegexTest();
        String check = "abc.@gmail.com";
        assertFalse(test.mailregex(check));
    }
    @Test
    public void Mailcheck21() {
        RegexTest test = new RegexTest();
        String check = "abc@abc@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck22() {
        RegexTest test = new RegexTest();
        String check = "abc@gmail.com.1a";
        assertFalse(test.mailregex(check));
    }
}