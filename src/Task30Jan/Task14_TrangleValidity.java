package Task30Jan;

import java.util.Scanner;

public class Task14_TrangleValidity {
    public static void main(String[] args) {
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter first side of triangle:");
        if(sc1.hasNextInt())
            side1 = sc1.nextInt();
        else {
            System.out.println("Entered number is not integer");
            System.exit(0);
        }

        Scanner sc2= new Scanner(System.in);
        System.out.println("Enter second side of triangle:");
        if(sc2.hasNextInt())
            side2 = sc2.nextInt();
        else {
            System.out.println("Entered number is not integer");
            System.exit(0);
        }

        Scanner sc3= new Scanner(System.in);
        System.out.println("Enter third side of Triangle:");

        if(sc3.hasNextInt())
            side3 = sc3.nextInt();
        else {
            System.out.println("Entered number is not integer");
            System.exit(0);
        }
        if(side1+side2 > side3 && side2+side3 > side1 && side1+side3 > side2)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is invalid");

    }
}
