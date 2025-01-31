package Task29Jan;

import java.util.Scanner;

public class Task2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            if ( num % 2 == 0)
                System.out.println("Entered number is even");
            else
                System.out.println("Entered number is odd");
        }else{
            System.out.println("Enetered number is not integer");
        }

    }
}
