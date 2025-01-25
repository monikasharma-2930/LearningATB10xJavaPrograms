package Lec19Jan;

public class Task19Jan_Q1_FindMaxNum {
    public static void main(String[] args) {
        int N1 = Integer.parseInt(args[0]);
        int N2 = Integer.parseInt(args[1]);
        int N3 = Integer.parseInt(args[2]);

        int Result = N1 > N2 ? (N1 > N3 ? N1 : N3): (N2 > N3 ? N2 : N3);
        System.out.println("Maximum number is "+Result);
    }
}
