package Task5Feb;

public class Task4_PrintSumof1to10 {
    public static void main(String[] args) {
        System.out.println("Using For loop");
        int sum = 0;
        for(int i=1;i<=10;i++)
            sum += i;
        System.out.println("sum="+sum);
        System.out.println("Using while loop");
        sum = 0;
        int j=1;
        while(j<=10) {
            sum += j;
            j++;
        }
        System.out.println("sum="+sum);
    }
}
