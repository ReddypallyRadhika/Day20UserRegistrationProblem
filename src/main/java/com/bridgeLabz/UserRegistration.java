package com.bridgeLabz;
/*uc3
As a User need to enter a valid email - E.g. abc.xyz@bl.co.in
- Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
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

}
