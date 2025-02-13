package Task7Feb;

public class Task7_Sum1To100 {
    public static void main(String[] args) {
        System.out.println("Using For loop");
        int sum=0;
        for(int i=1;i<=100;i++)
            sum+=i;
        System.out.println("sum="+sum);

        System.out.println("Using while loop");
        sum = 0;
        int j=1;
        while(j<=100){
            sum += j;
            j++;
        }
        System.out.println("Sum="+sum);
    }
}
