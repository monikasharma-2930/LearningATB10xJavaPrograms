package Task1Feb;

import java.util.Scanner;

public class checkDivisibilityBy5or11 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if(sc.hasNextInt()) {
            num = sc.nextInt();
            if(num<0){
                System.out.println("Entered number should be gfreater than 0");
                System.exit(0);
            }
            else{
                if(num%5==0 || num%11==0)
                    System.out.println("Entered number is divisible by 5 or 11");
                else
                    System.out.println("Entered number is not divisible by 5 or 11");
            }
        }
        else {
            System.out.println("Entered number is not integer");
            System.exit(0);
        }
    }
}
