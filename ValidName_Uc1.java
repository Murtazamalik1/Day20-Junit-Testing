package com.Junit;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.junit.Assert;
import org.junit.Test;

public class ValidFirstName_uc1 {

    @Test
    public void givenFirstName() {
        UserValidator validator = new UserValidator();
        Boolean Result = validator.validatefirstname("MURtaza");
        Assert.assertEquals(true, Result);

    }

    public class UserValidator {
        private static final String first_name_pattern = "^[A-Z]{3}[a-z]{4}";

        public boolean validatefirstname(String fname) {
            Pattern pattern = Pattern.compile(first_name_pattern);
            return pattern.matcher(fname).matches();
        }
    }
}

