import java.util.Scanner;

public class ArrLinearSearch {
    public static void main(String[] args) {
        int arr[]={45,23,22,11,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(findNum(arr,num)){
            System.out.println(num + " is present in an array.");
        }
        else {
            System.out.println("Number "+num+" is not present in an array.");
        }

    }

    public static boolean findNum(int arr[],int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num) {
                return true;
            }
        }
        return false;
    }
}
