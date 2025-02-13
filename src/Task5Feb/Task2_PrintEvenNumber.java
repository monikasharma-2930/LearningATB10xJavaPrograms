package Task5Feb;

public class Task2_PrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Using For loop:");
        for(int i=1; i<=20; i++){
            if(i%2 == 0)
                System.out.println(i);
        }
        System.out.println("Using while loop:");
        int j=1;
        while(j<=20){
            if(j%2 == 0)
                System.out.println(j);
            j++;
        }


    }
}
