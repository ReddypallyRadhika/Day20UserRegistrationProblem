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
    @Test
    public void TestUserEmail_True() {

        UserRegistration  email=new UserRegistration();
        boolean result=email.isValidUserEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);

    }
    @Test
    public void TestUserEmail_False() {

        UserRegistration  email=new UserRegistration();
        boolean result=email.isValidUserEmail("abc.xyz@bl.");
        Assert.assertFalse(result);

    }
    @Test
    public void TestUser_MobileNo_With_Country_Code_True() {

        UserRegistration  mobileNo=new UserRegistration();
        boolean result=mobileNo.isValidUserMobileNo("91 9919819801");
        Assert.assertTrue(result);

    }
    @Test
    public void TestUser_MobileNo_Without_Country_Code_False() {

        UserRegistration  mobileNo=new UserRegistration();
        boolean result=mobileNo.isValidUserMobileNo("9919819801");
        Assert.assertFalse(result);

    }
    @Test
    public void TestUser_MobileNo_Min_10digit_Number_False() {

        UserRegistration  mobileNo=new UserRegistration();
        boolean result=mobileNo.isValidUserMobileNo("9919819801");
        Assert.assertFalse(result);

    }


}
