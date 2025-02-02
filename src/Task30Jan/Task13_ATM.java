package Task30Jan;

import java.util.Scanner;

public class Task13_ATM {
    public static void main(String[] args) {
        int balance;
        int amt;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        if(sc.hasNextInt()){
            amt = sc.nextInt();
            if(amt==0)
                System.out.println("The amount should be greater than 0");
            else if(amt>10000)
                System.out.println("900The account should not exceed the amount balance");
            else if(amt%10 > 0)
                System.out.println("The amount should be a multiple of 100");
            else{
                balance = 10000;
                balance = balance - amt;
                System.out.println("Balanced Amount ="+ balance);
            }
        }else{
            System.out.println("Entered amount is invalid");
        }
    }
}
