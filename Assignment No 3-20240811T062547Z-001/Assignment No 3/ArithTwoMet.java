import java.util.Arrays;

public class ArithTwoMet {
    public static void main(String[] args) {
        int arr[][]={{4,5,6},{3,4,1}, {1,2,3}};
        int arr1[][]={{2,2,3}, {2,3,1},{1,1,1}};
        int result[][]=new int[3][3];
        float result1[][]=new float[3][3];

        System.out.println("Addition of two arrays: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }



        System.out.println("Subtraction of two arrays: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j]=arr[i][j]-arr1[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Division operation on two arrays");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(arr1[i][j]!=0){
                    result1[i][j]=(float) arr[i][j]/arr1[i][j];
                }
                else{
                    System.out.println("Cannot divide by zero");
                    return;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
