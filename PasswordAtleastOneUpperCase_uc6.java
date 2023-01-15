import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class PasswordAtleastOneUpperCase_uc6 {

    @Test
    public void ShouldHaveATLeast1UpperCase() {
       UserValidator validator = new UserValidator();
        Boolean Result = validator.validatePassword("Malikabc");
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String Password_Rule_pattern = "^[A-Za-z]{8}$";

        public boolean validatePassword(String Password) {
            Pattern pattern = Pattern.compile(Password_Rule_pattern);
            return pattern.matcher(Password).matches();
        }
    }
}

