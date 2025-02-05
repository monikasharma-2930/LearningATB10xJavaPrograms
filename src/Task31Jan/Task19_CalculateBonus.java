package Task31Jan;

import java.util.Scanner;

public class Task19_CalculateBonus {
    public static void main(String[] args) {
        float exp = 0;
        double salary = 0;
        int bonus;
        double bonusAmount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter years of experience:");
        if(sc.hasNextFloat()){
            exp = sc.nextFloat();
        }else {
            System.out.println("Enter experience in years only");
            System.exit(0);
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your salary:");
        if(sc1.hasNextDouble()){
            salary = sc1.nextDouble();
        }else {
            System.out.println("Enter valid value for salary");
            System.exit(0);
        }

        if(exp ==1)
            bonus = 0;
        else if (exp >= 1 && exp<=3)
            bonus = 5;
        else if(exp >=4 && exp <= 6)
            bonus = 10;
        else
             bonus = 15;

        bonusAmount = salary * bonus/100;

        System.out.println("Bonus amount is :"+ Math.round(bonusAmount));
    }
}