import java.util.Scanner;

public class check_PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number=s.nextInt();

        int count=0;
        if(number<=1){
            System.out.println(number+" is not a prime number");
        }else{
            for(int i=1;i<=number;i++){
                if(number%i==0){
                    count++;
                }
                
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not A Prime Number");
        }
    }
}
