package Task30Jan;

import java.util.Scanner;

public class Task9_CheckLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        if (sc.hasNextInt()){
            year = sc.nextInt();
            if(year % 4 == 0 )
                System.out.println("Entered year is a leap year");
            else
                System.out.println("Entered year is NOT a leap year");
        }else{
            System.out.println("Enter leap year");
            System.exit(0);
        }
    }
}
