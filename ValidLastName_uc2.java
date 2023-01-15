import com.Junit.ValidFirstName_uc1;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class ValidLastName_uc2 {
    @Test
    public void given3lastCapitalName() {
       UserValidator validator = new UserValidator();
        Boolean Result = validator.validatefirstname("murtAZA");
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String last_name_pattern = "[a-z]{4}[A-Z]{3}$";

        public boolean validatefirstname(String fname) {
            Pattern pattern = Pattern.compile(last_name_pattern);
            return pattern.matcher(fname).matches();
        }
    }
}

