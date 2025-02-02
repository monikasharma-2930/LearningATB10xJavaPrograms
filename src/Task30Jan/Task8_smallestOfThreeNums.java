package Task30Jan;

import java.util.Scanner;

public class Task8_smallestOfThreeNums {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number");
        if(sc1.hasNextInt()){
            num1 = sc1.nextInt();
        }else{
            System.out.println("Pleas enter an integer");
            System.exit(0);
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter second number");
        if(sc2.hasNextInt()){
            num2 = sc2.nextInt();
        }else{
            System.out.println("Pleas enter an integer");
            System.exit(0);
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter third number");
        if(sc3.hasNextInt()){
            num3 = sc3.nextInt();
        }else{
            System.out.println("Pleas enter an integer");
            System.exit(0);
        }

        int smallest;
        smallest = ( num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 <num3? num2 :num3);
        System.out.println("Smallest number is :" + smallest);
    }
}
