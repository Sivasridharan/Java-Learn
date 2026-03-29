import java.util.*;

public class RepeatedDigitalSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number=sc.nextInt();

        int digit =0;
        int sum=0;

        while(number>9){
            while(number>0){
                digit=number%10;
                sum=sum+digit;
                number=number/10;
            }
            if(sum>9){
                number=sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }
}
