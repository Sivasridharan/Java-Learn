import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        
     Scanner s=new Scanner(System.in);
       System.out.println("Enter the word");
       String wrd=s.next();
       String rev="";
       
       for(int i=wrd.length()-1;i>=0;i--){
           rev=rev+wrd.charAt(i);
       }
       if(wrd.equals(rev)){
           System.out.println("This word is Palindrome");
       }else{
           System.out.println("This word is not Palindrome");
       }
}
}
