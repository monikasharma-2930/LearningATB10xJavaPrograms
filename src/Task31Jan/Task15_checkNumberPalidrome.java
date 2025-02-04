package Task31Jan;

import java.util.Scanner;

public class Task15_checkNumberPalidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int reverseNum = 0;
        System.out.println("Enter the number:");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            while(num > 0){
                reverseNum = (reverseNum*10) + (num % 10);
                num = num/10;
            }
            System.out.println("Reversed number: "+ reverseNum);
        }else{
            System.out.println("Enter a valid integer");
        }


    }
}
