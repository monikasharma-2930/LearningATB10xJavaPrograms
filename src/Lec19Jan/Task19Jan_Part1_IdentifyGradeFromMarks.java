package Lec19Jan;

public class Task19Jan_Part1_IdentifyGradeFromMarks {
    public static void main(String[] args) {
        int Marks = 100;
        String grade = Marks >= 90 && Marks <= 100 ? "A" : (Marks >= 80 && Marks <=90 ? "B" : (Marks >= 70 && Marks <80 ? "C" :
                         (Marks >=60 && Marks <70 ? "D" :  "F" )));
        System.out.println(grade);

    }
}
