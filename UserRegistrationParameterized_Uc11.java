package day20;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class UserRegistrationParameterized_Uc11 {

    private final String email;
    private final String expectedResults;
    private UserRegistration read;

    public UserRegistrationParameterized_Uc11(String email, String expectedResults){
        this.email = email;
        this.expectedResults  = expectedResults;
    }

    @Before
    public void init() {
        read = new UserRegistration();
    }

    @Parameterized.Parameters

    public static Collection emailInput() {
        return Arrays
                .asList(new Object[][] { { "abc@yahoo.com", "Valid" }, { "abc.100@yahoo.com", "Valid" },
                        { "abc@gmail.com", "Valid" }, { "abc.xyz@bl.co.in", "Valid" } });
    }

    @Test
    public void testEmail(){
        Assert.assertEquals(expectedResults,read.validEmail(email));
    }
}
