package Task31Jan;

import java.util.Scanner;

public class Task17_checkLoanEligibility {
    public static void main(String[] args) {
         int age;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Age: ");
         if(sc.hasNextInt()){
             age = sc.nextInt();
             if (age < 0) {
                 System.out.println("Entered age is invalid");
                 System.exit(0);
             }
             else if(age<18) {
                 System.out.println("Age can not be less than 18 years");
                 System.exit(0);
             }
             else if(age>80) {
                 System.out.println("Age can not be more than 80 years");
                 System.exit(0);
             }
         }else {
             System.out.println("Enter age in years(numbers)");
             System.exit(0);
         }

         Scanner sc1 = new Scanner(System.in);
         long salary;
         System.out.println("Enter Salary:");
         if(sc1.hasNextLong()){
             salary = sc1.nextLong();
             if(salary < 0 ){
                 System.out.println("Salary can not be negative number");
                 System.exit(0);
             }else if(salary<10000){
                 System.out.println("Salary can not be less than 10000");
                 System.exit(0);
             }
         }else{
             System.out.println("Entered salary is not valid");
         }

        Scanner sc2 = new Scanner(System.in);
        int score;
        System.out.println("Enter credit score");
        if(sc2.hasNextLong()){
            score = sc2.nextInt();
            if(score < 0 ){
                System.out.println("Credit Score can not be negative number");
                System.exit(0);
            }else if(score<500){
                System.out.println("Credit score should be greater than 500");
                System.exit(0);
            }
        }else{
            System.out.println("Entered salary is not valid");
        }

        System.out.println("Congratulations!!! You are eligible for loan");
    }
}
