package Task1Feb;

import java.util.Scanner;

public class task25_identifySeniorCitizen {
    public static void main(String[] args) {
        int age;
        String type = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        if(sc.hasNextInt()){
            age = sc.nextInt();
            if(age>0 && age<=12)
                type = "Child";
            else if(age>=13 && age<=19)
                type = "Teenager";
            else if(age>=20 && age <=64)
                type = "Adult";
            else if(age>=65)
                type ="Senior Citizen";
            else {
                System.out.println("Entered age is not valid. Age should be greater than 0.");
                System.exit(0);
            }
            System.out.println(type);
        }else{
            System.out.println("Entered age is not valid");
            System.exit(0);
        }
    }
}
