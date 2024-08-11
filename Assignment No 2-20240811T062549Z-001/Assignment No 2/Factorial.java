public class Factorial {
    public static void main(String[] args) {
        int num,fact=1;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        for (int i = num; i >= 1; i--) {
            fact=fact*i;
        }
        System.out.println("Factorial of number "+num+" is: "+fact);
    }
}
