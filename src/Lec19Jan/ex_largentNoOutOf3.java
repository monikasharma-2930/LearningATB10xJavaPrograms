package Lec19Jan;

public class ex_largentNoOutOf3 {
    public static void main(String[] args) {
        int n1 = 13 ;
        int n2 = 11;
        int n3 = 15;
        int result = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println(result);
    }
}
