package first;

import java.util.Scanner;

public class A {
    private int arr[]=new int[5];
    private int oddSum=0;
    Scanner sc=new Scanner(System.in);
    public  A(){
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }

    public void displayOdd(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
                System.out.println(arr[i]+" is odd number.");
        }
    }

    public int calcOddAdd(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
                oddSum=oddSum+arr[i];
        }
        return oddSum;
    }
}
