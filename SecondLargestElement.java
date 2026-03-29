import java.util.*;

public class SecondLargestElement {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter How Many elements in array:");
        int elements=s.nextInt();
        int arr[]=new int[elements];
        System.out.println("Enter The elements in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The Second Largest number is "+arr[1]);
    }
}
