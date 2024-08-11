import java.util.Scanner;

public class FindRaise {
    public static void main(String[] args) {
        int result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Enter power of a number: ");
        int power= sc.nextInt();

        for (int i = 1; i <= power; i++) {
            result=result*num;
        }
        System.out.println("Result is: "+result);
    }
}
