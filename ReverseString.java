import java.util.Scanner;

public class ReverseString {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=s.nextLine();
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }
        
            System.out.println("Reversed String is: "+reverse);

        s.close();
        
    }
}
