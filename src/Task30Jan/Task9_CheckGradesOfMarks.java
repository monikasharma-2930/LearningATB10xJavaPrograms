package Task30Jan;

import java.util.Scanner;

public class Task9_CheckGradesOfMarks {
    public static void main(String[] args) {
        float marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks between 0-100:");
        if(sc.hasNextFloat()){
            marks = sc.nextFloat();
            if(marks < 0 && marks >100)
                System.out.println("Marks should be from 0 to 100");
            else if(marks>=90 && marks<=100)
                System.out.println("Grade: A+");
            else if(marks >=80 && marks <90)
                System.out.println("Grade A");
            else if(marks>=70 && marks<80)
                System.out.println("Grade B");
            else if(marks>=60 && marks<70)
                System.out.println("Grade C");
            else if(marks>=50 && marks<60)
                System.out.println("Grade D");
            else if(marks>=40 && marks<50)
                System.out.println("Grade E");
            else
                System.out.println("Fail");
        }else{
                System.out.println("Entered value is not a valid number");
        }
    }
}
