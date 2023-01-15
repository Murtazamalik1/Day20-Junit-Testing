import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class Password_uc7 {
    @Test
    public void ShouldHaveAtLeast1NumericNumber() {
      UserValidator validator = new UserValidator();
        Boolean Result = validator.validatePassword("malik1ab");//at least one numeric value
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String Password_Rule_pattern = "^[a-z0-9]{8}$";

        public boolean validatePassword(String Password) {
            Pattern pattern = Pattern.compile(Password_Rule_pattern);
            return pattern.matcher(Password).matches();
        }
    }
}
