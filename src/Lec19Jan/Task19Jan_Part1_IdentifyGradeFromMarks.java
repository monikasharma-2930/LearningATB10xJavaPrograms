package Lec19Jan;

public class Task19Jan_Part1_IdentifyGradeFromMarks {
    public static void main(String[] args) {
        int Marks = 59;
        String grade = Marks >= 90 && Marks <= 100 ? "A" : Marks >= 80 ? "B" : Marks >= 70 ? "C" : Marks >=60 ? "D" :  "F" ;
        System.out.println(grade);

    }
}
