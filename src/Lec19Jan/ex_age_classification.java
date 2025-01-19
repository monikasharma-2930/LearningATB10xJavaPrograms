package Lec19Jan;

public class ex_age_classification {
    public static void main(String[] args) {
        int age = 18;
        //senior, minor, adult
        String result = age > 60 ? "Senior" : (age > 18 ? "Adult" : "Minor");
        System.out.println(result);
    }
}
