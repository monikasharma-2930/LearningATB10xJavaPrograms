package Task29Jan;

import java.util.Scanner;

public class Task3_MaximumofTwoNumber {
    public static void main(String[] args) {
        int num1 =0 ;
        int num2 = 0;
       Scanner sc1= new Scanner(System.in);
       System.out.println("Enter first number");
       if(sc1.hasNextInt()){
           num1 = sc1.nextInt();
       }else{
           System.out.println("Entered number is not integer");
       }

        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter second number");
        if(sc2.hasNextInt()){
            num2 = sc2.nextInt();
        }else{
            System.out.println("Entered number is not integer");
        }
        if(num1>num2)
            System.out.println("First Numder "+num1+" is Maximum");
        else if(num1<num2)
            System.out.println("Second number "+num2+" is Maximum");
        else
            System.out.println("Both numbers re equal");
        sc1.close();
        sc2.close();
    }
}
