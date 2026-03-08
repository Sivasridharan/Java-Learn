import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter The Number");
        int number=s.nextInt();
        int num=number;
        int count=0;

        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(number+" is have a "+count+" digits");
        s.close();
    }
}
