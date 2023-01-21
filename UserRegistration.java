package custom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public String validFirstName(String fName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");

        Matcher matcher = pattern.matcher(fName);
        if (matcher.matches())
            return "valid";
        else
            throw new UserRegistrationException("Enter first valid name");
    }

    public String validSecondName(String lName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");

        Matcher matcher = pattern.matcher(lName);
        if (matcher.matches())
            return "valid";

        else
            throw new UserRegistrationException("enetr second valid name");
    }

    public String validEmailId(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return "valid";

        else throw new UserRegistrationException("enter valid email");
    }

    public String validPhoneNo(String phoneNo) throws UserRegistrationException {
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");

        Matcher matcher = pattern.matcher(phoneNo);
        if (matcher.matches())
            return "valid";

        else
            throw new UserRegistrationException("enter valid phone number");

    }

    public String validPassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile("^(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[@#$^&+=]).{8,}$\"");

        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return "valid";
        throw new UserRegistrationException("enter valid password");
    }

}
