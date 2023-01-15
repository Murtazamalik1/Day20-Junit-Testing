package uservalidation.regex;

import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.ValidFirstName();
        userRegistration.validLastName();
        userRegistration.validEmail();
        userRegistration.validPhoneNo();
        userRegistration.validPassword();
    }

    public void ValidFirstName(){

        Pattern pattern = Pattern.compile("^[A-Z]{3}[a-z]{4}");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter user first name");
        String firstName = scanner.next();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("first name is valid");
        }
        else {
            System.out.println(" first name is invalid");
        }
    }

    public void validLastName(){

        Pattern pattern = Pattern.compile("^[A-Z]{3}[a-z]{4}$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter user second name");
        String lastName = scanner.next();

        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println(" last name is valid");
        }
        else {
            System.out.println("invalid");
        }
    }

    public void validEmail(){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any email");
        String validEmail = scanner.next();

        Matcher matcher = pattern.matcher(validEmail);
        if (matcher.matches()){
            System.out.println(" valid email");
        }
        else {
            System.out.println("invalid email");
        }
    }
    public void validPhoneNo(){
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any phone number");
        String validPhone = scanner.next();

        Matcher matcher = pattern.matcher(validPhone);
        if (matcher.matches()){
            System.out.println(" valid phone number");
        }
        else {
            System.out.println("invalid");
        }
    }
public void validPassword(){
    Pattern pattern = Pattern.compile("^(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[@#$^&+=]).{8,}$\"");
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter any password");
    String password = scanner.next();

    Matcher matcher = pattern.matcher(password);
    if (matcher.matches()){
        System.out.println("  password is valid");
    }
    else {
        System.out.println(" password is invalid");
    }
  }
}
