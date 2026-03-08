import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number");
        int number=s.nextInt();
        int num=number;

        int digit,result=0;
        while(num>0){
            digit=num%10;
            result=result+digit*digit*digit;
            num=num/10;
        }
        if(number==result){
            System.out.println(number+" is Armstrong");
        }else{
            System.err.println(number+" is not Armstrong");
        }
        s.close();
    }
}
