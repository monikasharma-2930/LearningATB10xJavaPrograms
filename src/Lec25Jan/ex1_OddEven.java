package Lec25Jan;


import java.util.Scanner;

public class ex1_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd number");

    }
}
