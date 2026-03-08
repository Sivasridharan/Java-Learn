import java.util.Scanner;

public class SumOfDigits {
     public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter The Number");
        int num=s.nextInt();
        int sum=0;
        int digit=0;

        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of digit is "+sum);

        s.close();
    }
}
