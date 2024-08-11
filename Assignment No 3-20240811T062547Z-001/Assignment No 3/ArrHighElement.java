public class ArrHighElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,3},max=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
