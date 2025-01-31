package Task29Jan;

import java.util.Scanner;

public class Task4_Vowel_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println(ch + " is a vowel");
                    break;
                default:
                    System.out.println(ch + " is a consonant");
            }
        }else{
            System.out.println("Please enter a character");
        }

    }
}
