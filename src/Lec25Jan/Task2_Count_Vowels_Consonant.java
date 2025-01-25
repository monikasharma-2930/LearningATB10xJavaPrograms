package Lec25Jan;

public class Task2_Count_Vowels_Consonant {
    public static void main(String[] args) {
        String name = "pramod";
        int vCnt = 0;
        int cCnt = 0;
        for(int i=0; i<name.length(); i++){
            switch (name.charAt(i)){
                case 'a','e','i','o','u':
                    vCnt++;
                    break;
                default:
                    cCnt++;
            }
        }
        System.out.println("Vowels="+vCnt);
        System.out.println("Consonants="+cCnt);
    }
}
