package Lec25Jan;

import java.util.Scanner;

public class Task3_Palindrome {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a case sensitive word");
        String enteredStr = sc.nextLine();
        String reversedStr = "";
        for(int i=enteredStr.length()-1; i>=0 ; i--){
            reversedStr = reversedStr + enteredStr.charAt(i);
        }
        System.out.println(enteredStr);
        System.out.println(reversedStr);
        if(enteredStr.equals(reversedStr))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not Palindrome");

    }
}
