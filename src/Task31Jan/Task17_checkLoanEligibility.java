package Task31Jan;

import java.util.Scanner;

public class Task17_checkLoanEligibility {
    public static void main(String[] args) {
         int age;
         String error="";
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Age: ");
         if(sc.hasNextInt()){
             age = sc.nextInt();
             if (age < 0) {
                 error = "Entered age is invalid\n";
             }
             else if(age<18) {
                 error = "Age can not be less than 18 years\n";
             }
             else if(age>80) {
                 error = "Age can not be more than 80 years\n";
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
                 error += "Salary can not be a negative number\n";
             }else if(salary<10000){
                 error += "Salary can not be less than 10000\n";
             }
         }else{
             System.out.println("Entered salary is not valid");
             System.exit(0);
         }

        Scanner sc2 = new Scanner(System.in);
        int score;
        System.out.println("Enter credit score");
        if(sc2.hasNextLong()){
            score = sc2.nextInt();
            if(score < 0 ){
                error += "Credit Score can not be negative number";
            }else if(score<500){
                error += "Credit score should be greater than 500";
            }
        }else{
            System.out.println("Entered credit score is not valid");
            System.exit(0);
        }
        if(error.trim().isEmpty()){
            System.out.println(error);
            System.out.println("Congratulations!!! You are eligible for loan");
        }
        else {
            System.out.println("Sorry!!! You are eligible for loan because: \n"+error);
        }
    }
}
