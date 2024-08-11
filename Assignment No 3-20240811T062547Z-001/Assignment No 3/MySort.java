import java.lang.reflect.Array;
import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int arr[]={11,5,7,3,4,1,8,10,6},temp=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
