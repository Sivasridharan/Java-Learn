import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=s.nextLine();
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' ||
               word.charAt(i)=='i' || word.charAt(i)=='o' || 
               word.charAt(i)=='u' || word.charAt(i)=='A' || 
               word.charAt(i)=='E' || word.charAt(i)=='I' || 
               word.charAt(i)=='O' || word.charAt(i)=='U'){

                count++;
               }
        }
            System.out.println("Count of the vowels: "+count);

        s.close();
        
    }
}
