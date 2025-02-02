package Task30Jan;

import java.util.Scanner;

public class Task11_CheckAlphabet {
    public static void main(String[] args) {
        char ch=' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        String st = sc.next();
        if (st.length() > 1) {
            System.out.println("You did not enter a single character");
            System.exit(0);
        }
        else
            ch = st.charAt(0);

        if(Character.isAlphabetic(ch))
            System.out.println("Entered character is an alphabet");
        else
            System.out.println("Entered character is not an alphabet");

    }
}
