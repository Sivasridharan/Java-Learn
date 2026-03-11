import java.util.Scanner;

public class Largest_Element {
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter number of elements:");
     int n=s.nextInt();
     int array[]=new int[n];
     System.out.println("Enter the numbers:");
     for(int i=0;i<n;i++){
        array[i]=s.nextInt();
     }
     int max=array[0];
     for(int num:array){
        if(num>max){
            max=num;
        }
     }
     System.err.println("The Largest Element In The Array Is "+max);

     
 }   
}
