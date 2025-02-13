package Task5Feb;

public class Task5_PrintTableOf5 {
    public static void main(String[] args) {
       int i;
       System.out.println("Using for loop");
       for(i=1;i<=10;i++)
           System.out.println("5*"+i+"="+5*i);
        System.out.println("Using while loop");
        int j=1;
        while(j<=10) {
            System.out.println("5*" + j + "=" + 5 * j);
            j++;
        }
    }
}
