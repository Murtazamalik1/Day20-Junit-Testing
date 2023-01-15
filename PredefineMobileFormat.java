import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class PredefineMobileFormat {
    @Test
    public void PredefineMobileFormat() {
       UserValidator validator = new UserValidator();
        Boolean Result = validator.validateMobileFormat("91 6005627671");
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String Mobile_Format_pattern = "^[91]{2}(\\s)[0-9]+";

        public boolean validateMobileFormat(String Mobile) {
            Pattern pattern = Pattern.compile(Mobile_Format_pattern);
            return pattern.matcher(Mobile).matches();
        }
    }
}

