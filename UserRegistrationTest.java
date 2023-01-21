package custom;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    static UserRegistration user;
    @Before
    public  void initiate(){
        user = new UserRegistration();
    }
    @Test
    public void FirstThreeNameStartWithCapital() {
        try {

            String actual = user.validFirstName("MURtaza");
            String expected = "valid";
            Assert.assertEquals(expected, actual);
        }catch (UserRegistrationException e){
            System.out.println("Enter first name" + e.getMessage());
        }
    }
    @Test
    public void lastThreeStartWithCapital(){
        try {

        String actual = user.validSecondName("Murtaza");
        String expected = "invalid";
        Assert.assertEquals(actual, expected);
    }
        catch (UserRegistrationException e){
            System.out.println("enter second name" +e.getMessage());
        }
    }


    @Test
    public void givenEmailWhenDoesNotContainTheRateShouldReturnFalse() {
        try {


            String actual = user.validEmailId("murtaza.yahoo.com");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmailWhenDoesNotContainMoreThanThreeCharLastShouldReturnFalse() {
        try {

            String actual = user.validEmailId("XYZ.yahoo.co.india");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println("Enter valid email" +e.getMessage());
        }
    }

    @Test
    public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse() {
        try {

            String actual = user.validEmailId("XYZ.yahoo.co.in.co");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println("Enter Valid Email" +e.getMessage());
        }
    }

    @Test
    public void givenEmailWhenAccordingToProperFormatShouldReturnTrue() {
        try {

            String actual = user.validEmailId("abc.xyz@b1.co.in");
            String expected = "valid";
            Assert.assertEquals(actual, expected);

        }catch (UserRegistrationException e){
            System.out.println("Enter Valid Email " +e.getMessage());
        }
    }

    @Test
    public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue() {
        try {

            String actual = user.validPhoneNo("91 6005626571");
            String expected = "valid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println(" Enter valid Phone number " +e.getMessage());
        }
    }

    @Test
    public void givenMobileNumberWithoutSpaceShouldReturnFalse () {
        try {

            String actual = user.validPhoneNo("916005626571");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println("Enter valid Phone number " +e.getMessage());
        }
    }

    @Test
    public void givenMobileNumberWithoutProperCountryCodeShouldReturnFalse() {
        try {

            String actual = user.validPhoneNo("566005626571");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println("Enter Valid Phone Number" +e.getMessage());
        }
    }

    @Test
    public void givenPasswordWithoutUpperCaseShouldReturnFalse() {
        try {

            String actual = user.validPassword("abczz@123");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println(" Enter Valid Phone password"+e.getMessage());
        }
    }

    @Test
    public void givenPasswordWithoutSpecialCharShouldReturnFalse() {
        try {

            String actual = user.validPassword("abczz123");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println(" Enter Valid Password " +e.getMessage());
        }
    }

    @Test
    public void givenPasswordWithoutMinNumOfCharShouldReturnFalse() {
        try {

            String actual = user.validPassword("af@123");
            String expected = "invalid";
            Assert.assertEquals(actual, expected);
        }catch (UserRegistrationException e){
            System.out.println("Enter Valid Password" +e.getMessage());
        }
    }

    @Test
    public void givenPasswordWithProperRequirementShouldReturnTrue() {
        try {

            String actual = user.validPassword("ABczz@123");
            String expected = "valid";
            Assert.assertEquals(expected, actual);
        }catch (UserRegistrationException e){
            System.out.println("Enter Valid password :" +e.getMessage());
        }
    }
}