import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class Password_uc8 {
    @Test
    public void ShouldHaveExactly1SpecialCharacter() {
       UserValidator validator = new UserValidator();
        Boolean Result = validator.validatePassword("malik@12");
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String Password_Rule_pattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

        public boolean validatePassword(String Password) {
            Pattern pattern = Pattern.compile(Password_Rule_pattern);
            return pattern.matcher(Password).matches();
        }
    }
}

