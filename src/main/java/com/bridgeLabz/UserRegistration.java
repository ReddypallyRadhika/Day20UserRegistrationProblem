package com.bridgeLabz;
/*uc4
As a User need to follow pre-defined Mobile Format - E.g. 91 9919819801
- Country code follow by space and 10digit number
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isValidUserFirstname(String firstName) {
        String nameRegex = "^[A-Z]\\w{2,29}$";
        Pattern patternObject = Pattern.compile(nameRegex);
        Matcher matcherObject = patternObject.matcher(firstName);
        return matcherObject.matches();
    }
    public static boolean isValidUserLastname(String lastName) {
        String lastNameRegex = "[A-Z]+([ '-][a-zA-Z]+){3,29}$";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        Matcher matcherObject = patternObject.matcher(lastName);
        return matcherObject.matches();
    }
    public static boolean isValidUserEmail(String email) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        //abc.xyz@bl.co.in
        Pattern patternObject = Pattern.compile(emailRegex);
        Matcher matcherObject = patternObject.matcher(email);
        return matcherObject.matches();
    }
    public static boolean isValidUserMobileNo(String mobileNo) {
        String mobileNoRegex = "([0-9]{2})[-.●\s]?([0-9]{10})$";
        Pattern patternObject = Pattern.compile(mobileNoRegex);
        Matcher matcherObject = patternObject.matcher(mobileNo);
        return matcherObject.matches();
    }
}
