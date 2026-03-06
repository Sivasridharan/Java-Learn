/* ascending order */

public class ascending_order {
    public static void main(String[] args) {
        int arr[]={3,30,5,66,2,21,4,6,54};
    int temp=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int sort:arr){
        System.out.println(sort);
    }
    }
}
