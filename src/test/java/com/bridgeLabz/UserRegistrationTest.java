package com.bridgeLabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public  void TestUserFirstName_First_Letter_Caps_True() {

        UserRegistration firstname = new UserRegistration();
        boolean result = firstname.isValidUserFirstname("Radhika");
        Assert.assertTrue(result);
    }
        @Test
        public void TestUserFirstName_Short_False() {

            UserRegistration  firstname1=new UserRegistration();
            boolean result1=firstname1.isValidUserFirstname("sagar");
            Assert.assertFalse(result1);
        
    }
    @Test
    public void TestUserFirstName_3_Letters_Min_False() {

        UserRegistration  firstname2=new UserRegistration();
        boolean result2=firstname2.isValidUserFirstname("Rs");
        Assert.assertFalse(result2);

    }

    @Test
    public  void TestUserLastName_First_Letter_Caps_True() {

        UserRegistration lastname = new UserRegistration();
        boolean result = lastname.isValidUserLastname("Radhika");
        Assert.assertTrue(result);
    }
    @Test
    public void TestUserLastName_Short_False() {

        UserRegistration  lastname1=new UserRegistration();
        boolean result1=lastname1.isValidUserLastname("sagar");
        Assert.assertFalse(result1);

    }
    @Test
    public void TestUserLastName_3_Letters_Min_False() {

        UserRegistration  lastname2=new UserRegistration();
        boolean result2=lastname2.isValidUserLastname("Rs");
        Assert.assertFalse(result2);

    }

}
