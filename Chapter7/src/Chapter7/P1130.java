package Chapter7;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by PuFan on 2016/12/1.
 */
public class P1130 {
    static public void main(String[] args) {
        checkInf ck = new checkInf();
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your FirstName:");
        System.out.println("Your input is " + ck.checkFirstName(in.nextLine()));
        System.out.println("Please input your LastName:");
        System.out.println("Your input is " + ck.checkLastName(in.nextLine()));
        System.out.println("Please input your EmailAddress:");
        System.out.println("Your input is " + ck.checkEmailAddress(in.nextLine()));
        System.out.println("Please input your PhoneNumber:");
        System.out.println("Your input is " + ck.checkPhoneNumber(in.nextLine()));
        System.out.println("Please input your PostNumber:");
        System.out.println("Your input is " + ck.checkPostNumber(in.nextLine()));
    }
}

class checkInf {
    boolean checkFirstName(String str) {
        return Pattern.matches("[A-Z]\\w+", str);
    }

    boolean checkLastName(String str) {
        return Pattern.matches("[A-Za-z-]+", str);
    }

    boolean checkEmailAddress(String str) {
        return Pattern.matches("[a-zA-z0-9]+@[a-zA-z0-9]+\\.[a-zA-z0-9]+", str);
    }

    boolean checkPhoneNumber(String str) {
        return Pattern.matches("^1[3568]\\d{9}", str);
    }

    boolean checkPostNumber(String str) {
        return Pattern.matches("^\\d{6}", str);
    }


}
