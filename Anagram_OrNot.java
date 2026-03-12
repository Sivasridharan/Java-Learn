import java.util.*;
public class Anagram_OrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the two words:");
        String word1=sc.nextLine();
        String word2=sc.nextLine();
        if(word1.length()!=word2.length()){
            System.out.println("Not Anagram");
        }else{
        
        char ch1[]=new char[word1.length()];
        for(int i=0;i<word1.length();i++){
            ch1[i]=word1.charAt(i);
        }
        Arrays.sort(ch1);
        
        char ch2[]=word2.toCharArray();
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        
        
        }
    }
}


