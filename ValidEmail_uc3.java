import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class ValidEmail_uc3 {
    @Test
    public void ValidEmailAddress() {
       UserValidator validator = new UserValidator();
        Boolean Result = validator.validateEmailAddress("abc.XYZ@bl.co.in");
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String Email_Address_pattern = "^[A-Za-z0-9+_.-]+@(.+)$";

        public boolean validateEmailAddress(String Email) {
            Pattern pattern = Pattern.compile(Email_Address_pattern);
            return pattern.matcher(Email).matches();
        }
    }
}
