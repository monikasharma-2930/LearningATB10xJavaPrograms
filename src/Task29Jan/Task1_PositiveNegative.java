package Task29Jan;

import java.util.Scanner;

public class Task1_PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > 0)
                System.out.println("Entered number is positive");
            else if (num < 0)
                System.out.println("Entered number is negative");
            else
                System.out.println("Please enter a number other than 0");
        }else{
            System.out.println("Enetered number is not integer");
        }
    }
}
