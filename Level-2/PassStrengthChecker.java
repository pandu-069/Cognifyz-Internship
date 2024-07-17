import java.util.*;

public class PassStrengthChecker {

    private static final String symbols = "!@#$%^&*(){[]}:;'.>";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password to check the Strength of it: ");
        String password = sc.nextLine();

        boolean strong = isStrong(password);
        if (strong == true) {
            System.out.println("Entered password is a Strong password");
        } else {
            System.out.println("Entered password is weak");
        }
        sc.close();

    }

    public static boolean isStrong(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasupper = false;
        boolean haslower = false;
        boolean hasnumbers = false;
        boolean hassymbols = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasupper = true;
            } else if (Character.isLowerCase(ch)) {
                haslower = true;
            } else if (Character.isDigit(ch)) {
                hasnumbers = true;
            } else if (symbols.indexOf(ch) > 0) {
                hassymbols = true;
            }

        }
        return haslower && hasnumbers && hassymbols && hasupper;
    }
}
