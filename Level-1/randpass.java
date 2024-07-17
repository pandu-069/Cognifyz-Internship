import java.security.SecureRandom;
import java.util.*;

public class randpass {
    private static final String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Lowercase = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "1234567890";
    private static final String Symbols = "!@#$%^&*():;><.,?/|[]{}";
    private static final String ALL_CHAr = Uppercase + Lowercase + numbers + Symbols ;
    
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the password to be provided: ");
        int passlen = sc.nextInt();

        String ranpass = genranpass(passlen);
        System.out.println("Generated Random password: "+ ranpass);
        sc.close();
    }

    public static String genranpass(int len){

        StringBuilder password = new StringBuilder();
        
        password.append(Uppercase.charAt(random.nextInt(Uppercase.length())));
        password.append(Lowercase.charAt(random.nextInt(Lowercase.length())));
        password.append(Symbols.charAt(random.nextInt(Symbols.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length())));

        for (int i = 4; i < len; i++)
        {
            password.append(ALL_CHAr.charAt(random.nextInt(ALL_CHAr.length())));

        }

        return ShuffleString(password.toString());
    }

    private static String ShuffleString(String input)
    {
        char[] characters = input.toCharArray();
        for(int i = 0; i< characters.length; i++)
        {
            int randindex = random.nextInt(characters.length);

            char temp = characters[i];
            characters[i] = characters[randindex];
            characters[randindex] = temp;
        }

        return new String(characters);
    }

    
    
} 
