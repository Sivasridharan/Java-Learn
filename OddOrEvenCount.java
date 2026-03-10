import java.util.Scanner;

public class OddOrEvenCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Size of Array");
        int size=s.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        int odd=0;
        int even=0;

        for(int result:array){
            if(result%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of odds:"+odd);
        System.out.println("Number of evens:"+even);

        s.close();

    }
}
