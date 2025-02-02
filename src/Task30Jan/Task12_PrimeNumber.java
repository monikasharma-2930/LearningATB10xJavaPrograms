package Task30Jan;

import java.util.Scanner;

public class Task12_PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            if (num <=1) {
                System.out.println("Entered number is not Prime");
                System.exit(0);
            }
            for(int i=2; i<Math.sqrt(num); i++){
                if(num%i == 0) {
                    System.out.println("Entered number is not Prime");
                    System.exit(0);
                }
            }
            System.out.println("Entered number is Prime");
        }else{
            System.out.println("Entered number is invalid");
        }
    }
}
