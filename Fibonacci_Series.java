import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number Of Terms:");
        int term=s.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=term;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
