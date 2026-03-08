
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter The Number:");
        int num=s.nextInt();

        int digit=0;
        int reverse_num=0;

        while(num>0){
            digit=num%10;
            reverse_num=reverse_num*10+digit;
            num=num/10;
        }
        System.out.println(reverse_num);

        s.close();
    }
    
}
