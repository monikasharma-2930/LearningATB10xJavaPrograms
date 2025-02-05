package Task31Jan;

import java.util.Scanner;

public class Task18_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double units;
        double bill = 0;
        double rate;
        System.out.println("Enter units");
        if(sc.hasNextDouble()){
            units = sc.nextDouble();
            if(units>0){
                int i=1;
                while(units>0){
                    if (i == 1)
                        rate = 0.50;
                    else if(i==2)
                        rate =0.75;
                    else if(i ==3)
                        rate =1.20;
                    else
                        rate = 1.50;
                    if(units<100) {
                        bill += units * rate;
                        units = 0;
                    }else {
                        bill += 100 * rate;
                        units = units - 100;
                    }
                    i++;
                }
                System.out.println("Your electricity bill is "+ bill);
            }else
                System.out.println("Units should be greater than 0");
        }else
            System.out.println("Enter units are not valid");

    }
}
