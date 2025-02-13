package Task7Feb;

import java.util.Scanner;

public class Task8_generateTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        if(sc.hasNextInt()){
            num = sc.nextInt();
            if(num>0){
                for(int i=1; i<=10; i++)
                    System.out.println(num + "*" + i +"="+num*i);
            }else{
                System.out.println("Enter a number greater than 0.");
                System.exit(0);
            }
        }else{
            System.out.println("Please enter an integer");
            System.exit(1);
        }

    }
}
