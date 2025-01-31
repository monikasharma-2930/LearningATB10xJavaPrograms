package Task29Jan;

import java.util.Scanner;

public class Task5_CheckVoteEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        if(sc.hasNextInt()) {
            int age = sc.nextInt();
            if (age>=18)
                System.out.println("Eligible for voting");
            else
                System.out.println("Not eligible for voting");

        }else{
            System.out.println("Enter valid number for age");
        }

    }
}
