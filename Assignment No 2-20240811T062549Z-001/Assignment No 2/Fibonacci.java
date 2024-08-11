import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       int prevNum=0,curNum=1, k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int nthTerm= sc.nextInt();
        System.out.println("Fibonacci series: ");
       while (curNum+prevNum<=nthTerm){
           if(prevNum==0){
               System.out.println(0);
           }
           k=curNum;
           curNum=curNum+prevNum;
           prevNum=k;
           System.out.println(curNum);
       }
    }
}
