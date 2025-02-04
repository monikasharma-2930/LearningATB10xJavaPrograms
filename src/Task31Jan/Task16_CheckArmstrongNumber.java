package Task31Jan;

import java.util.Scanner;

public class Task16_CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numTotal=0;
        int len = 0;
        System.out.println("Enter a number: ");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            int orgNum = num;
            len = String.valueOf(num).length();
            while(num>0){
                numTotal += Math.pow(num%10, len);
                num=num/10;
            }
            if(orgNum == numTotal)
                System.out.println("Entered number is an Armstrong number");
            else
                System.out.println("Entered number is not an Armstrong number");
        }else
            System.out.println("Enter a valid Integer");
    }



}
