import java.util.*;

class temp{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the temparature ");
        float tempp = sc.nextFloat();
        sc.nextLine();
        System.out.println("Now enter the format of above entered temparature ");
        System.out.println("If fahrenheit == 'F'  || Celsius == 'c' " );
        String temp_format = sc.nextLine();
        if (temp_format.equals("c") || temp_format.equals("C"))
        {
            Float updated_tem = cel_fah(tempp);
            System.out.println("The updted temparature from celsius to fahrenheit is : "+updated_tem);

        }
        else if (temp_format.equals("f") || temp_format.equals("F"))
        {
            Float updated_tem = fah_cel(tempp);
            System.out.println("The updted temparature from  fahrenheit to celsius is : "+updated_tem);
            
        }


        sc.close();
    }
    static Float cel_fah(Float temp)
    {
        return (temp * 9/5) + 32;
    }
    static Float fah_cel(Float temp)
    {
        return (temp - 32) * 5/9;
    }
}