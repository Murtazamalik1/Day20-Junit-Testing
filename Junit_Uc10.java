package day20;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Junit_Uc10 {
    static UserRegistration user;
    @Before
    public  void initiate(){
        user = new UserRegistration();
    }
    @Test
    public void FirstThreeNameStartWithCapital(){
        String actual = user.validFirstName("MURtaza");
        String expected = "valid";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void lastThreeStartWithCapital(){
        String actual = user.validLastName("Murtaza");
        String expected = "invalid";
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void givenEmailWhenDoesNotContainTheRateShouldReturnFalse(){
        String actual = user.validEmail("murtaza.yahoo.com");
        String expected = "invalid";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void givenEmailWhenDoesNotContainMoreThanThreeCharLastShouldReturnFalse(){
        String actual = user.validEmail("XYZ.yahoo.co.india");
        String expected = "invalid";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse(){
        String actual = user.validEmail("XYZ.yahoo.co.in.co");
        String expected = "invalid";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void givenEmailWhenAccordingToProperFormatShouldReturnTrue(){
        String actual = user.validEmail("abc.xyz@b1.co.in");
        String expected = "valid";
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue(){
        String actual = user.validPhoneNumber("91 6005626571");
        String expected = "valid";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void givenMobileNumberWithoutSpaceShouldReturnFalse () {
        String actual = user.validPhoneNumber("916005626571");
        String expected = "invalid";
        Assert.assertEquals(actual, expected);



   }

   @Test
   public void givenMobileNumberWithoutProperCountryCodeShouldReturnFalse(){
       String actual = user.validPhoneNumber("566005626571");
       String expected = "invalid";
       Assert.assertEquals(actual, expected);
   }

   @Test
   public void givenPasswordWithoutUpperCaseShouldReturnFalse(){
       String actual = user.validPassword("abczz@123");
       String expected = "invalid";
       Assert.assertEquals(actual, expected);
   }

   @Test
   public void givenPasswordWithoutSpecialCharShouldReturnFalse(){
       String actual = user.validPassword("abczz123");
       String expected = "invalid";
       Assert.assertEquals(actual, expected);
   }

   @Test
   public void givenPasswordWithoutMinNumOfCharShouldReturnFalse(){
       String actual = user.validPassword("af@123");
       String expected = "invalid";
       Assert.assertEquals(actual, expected);
   }

   @Test
   public void givenPasswordWithProperRequirementShouldReturnTrue(){
       String actual = user.validPassword("ABczz@123");
       String expected = "valid";
     Assert.assertEquals(expected,actual);
   }
}
