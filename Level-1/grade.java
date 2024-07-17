import java.util.Scanner;

public class grade {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of grades ");
        int num = sc.nextInt();
        float sum = 0;
        for(int i = 0; i < num; i++)
        {
            System.out.print("Enter the grade for subject "+(i+1)+":");
            float grade = sc.nextFloat();
            sum = sum + grade;
        }
        float avg = sum / num;
        System.out.println("The average of all the grades are :" + avg);
        sc.close();
    }
    
}
