package Task1Feb;

import java.util.Scanner;

public class task24_ConvertDaysIntoYMD {
    public static void main(String[] args) {
        int enteredDays, years, months, remainingDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        if(sc.hasNextInt()){
            enteredDays = sc.nextInt();
            if(enteredDays<0) {
                System.out.println("Number of days should be greater than 0");
                System.exit(0);
            }else{
                years = enteredDays / 365;
                remainingDays = enteredDays % 365;
                months = remainingDays/30;
                remainingDays = remainingDays % 30;
                if (years > 0)
                    System.out.println(years+" Year(s)");
                if (months > 0)
                    System.out.println(months+" Month(s)");
                if (remainingDays > 0)
                    System.out.println(remainingDays+" days(s)");
            }
        }else{
            System.out.println("Entered number of days are invalid");
            System.exit(0);
        }
    }
}
