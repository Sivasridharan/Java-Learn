
import java.util.Scanner;

public class SumOfElement_Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int size=s.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }

        int sum=0;
        for(int result:array){
            sum=sum+result;
        }
        System.out.println("Sum of elements in the array: "+sum);

        s.close();
    }
}
