public class ArrayAvg {
    public static void main(String[] args) {
        int arr[]={10,20,34,23,12,10};
        int i=0;
        float sum=0;
        while (i< arr.length){
            sum+=arr[i];
            i++;
        }
        System.out.println("Average of array elements is: "+(sum/ arr.length));

    }
}
