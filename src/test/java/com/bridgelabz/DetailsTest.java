package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetailsTest {

    @Test
    public void moodtest() {
        String expectedresult = "HAPPY";
        String actualresult = HappyOrSad.moodanalyze("HAPPY");
        assertEquals(expectedresult, actualresult);
    }


    @Test
    public void firstname() {
        String firstname = "Sandeep";
        assertTrue(ValidateDetailsTest.name(firstname));
    }

    @Test
    public void lastname() {
        String lastname = "Varma";
        assertTrue(ValidateDetailsTest.name(lastname));
    }

    @Test
    public void mail() {
        String mail = "karanvarma619@gmail.com";
        assertTrue(ValidateDetailsTest.mail(mail));
    }

    @Test
    public void phonenumber() {
        String phonenumber = "91 9004223344";
        assertTrue(ValidateDetailsTest.phonenumber(phonenumber));
    }

    @Test
    public void password() {
        String password = "Karan@1234";
        assertTrue(ValidateDetailsTest.password(password));
    }
}

