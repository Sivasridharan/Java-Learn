import java.util.Scanner;

public class polindrome_integer {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number=s.nextInt();
        int num=number;

        int digit=0;
        int reverse_num=0;

        while(num>0){
            digit=num%10;
            reverse_num=reverse_num*10+digit;
            num=num/10;
        }
        if(reverse_num==number){
            System.out.println(number+" is Polindrome");
        }else{
            System.out.println(number+" is not Polindrome");
        }

        s.close();
    }
}
