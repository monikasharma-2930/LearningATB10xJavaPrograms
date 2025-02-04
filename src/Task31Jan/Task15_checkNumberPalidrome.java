package Task31Jan;

import java.util.Scanner;

public class Task15_checkNumberPalidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num5
        int reverseNum = 0;
        System.out.println("Enter the number:");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            int orgNum = num;
            while(num > 0){
                reverseNum = (reverseNum*10) + (num % 10);
                num = num/10;
            }
            if(reverseNum == orgNum)
                System.out.println("Entered number is a Palindrome");
            else
                System.out.println("Entered number is not a Palindrome");
        }else{
            System.out.println("Enter a valid integer");
        }


    }
}
