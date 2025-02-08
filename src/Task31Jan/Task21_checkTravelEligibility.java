package Task31Jan;

import java.util.Scanner;

public class Task21_checkTravelEligibility {
    public static void main(String[] args) {
        int age=0;
        int visaStatus = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        if(sc.hasNextInt()){
            age = sc.nextInt();
            if(age<0 || age <18) {
                System.out.println("Age for travel should be 18 and above");
                System.exit(0);
            }
        }else {
            System.out.println("Enter age only in years(Integer)");
            System.exit(0);
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Visa status in 1(valid) or 0(invalid): ");
        if(sc1.hasNextInt()){
            visaStatus = sc1.nextInt();
        }else {
            System.out.println("Enter status in 1 or 0");
            System.exit(0);
        }
        if(age>=18 && visaStatus==1)
            System.out.println("You are eligible to travel");
        else
            System.out.println("You are not eligible for travel");

    }
}
