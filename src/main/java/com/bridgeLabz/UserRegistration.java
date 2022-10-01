package com.bridgeLabz;
/*uc2
As a User need to enter a valid Last Name
- Last name starts with Cap and has minimum 3 characters
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
        String lastNameRegex = "[A-Z]+([ '-][a-zA-Z]+)*";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        Matcher matcherObject = patternObject.matcher(lastName);
        return matcherObject.matches();
    }

}
