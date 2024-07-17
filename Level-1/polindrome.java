import java.util.*;

class polindrome{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check whether it is a polindrome or not.");
        String name = sc.nextLine();
        boolean ispol = ispolindrome(name);
        if (ispol) {
            System.out.println("The given string is a polindrome");
        }
        else{
            System.out.println("The given String is not a polindrome");
        }
        sc.close();
    }
    static boolean ispolindrome(String name)
    {
        int left = 0;
        int right = name.length()-1;
        while (left <  right)
        {
            if(name.charAt(left) != name.charAt(right))
            {
                return false;

            }
            left++;
            right--;
        }
        return true;

    }
}