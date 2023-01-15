package day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public String validFirstName(String fName){
        Pattern pattern =  Pattern.compile("^[A-Z]{3}[a-z]{4}");
        Matcher matcher = pattern.matcher(fName);
        if (matcher.matches())
            return "valid";
        else
            return "invalid";
    }

    public String validLastName(String lName){
        Pattern pattern = Pattern.compile("[A-Z]{3}[a-z]{4}$");
        Matcher matcher = pattern.matcher(lName);
        if (matcher.matches())
            return "valid";
        else
            return "invalid";
    }

    public String validEmail(String email){
        Pattern pattern = Pattern.compile("^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return "valid";

        else
            return "invalid";

    }
    public String validPhoneNumber(String pNumber){
        Pattern pattern = Pattern.compile("91\s[6-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(pNumber);
        if (matcher.matches())
            return "valid";
        else
            return "invalid";
    }

    public String validPassword(String password){
        Pattern pattern = Pattern.compile("^(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[@#$%^&+=])?.{8,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return "valid";

        else
            return "invalid";
    }
}
