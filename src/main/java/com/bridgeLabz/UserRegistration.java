package com.bridgeLabz;
/*uc1
As a User need to enter a valid First Name
- First name starts with Cap and has minimum 3 characters
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

}
