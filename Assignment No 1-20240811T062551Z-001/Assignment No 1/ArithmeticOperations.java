import java.util.Scanner;
class ArithmeticOperations {
    Scanner sc=new Scanner(System.in);
    int a;
    int b;
    void add(){
        int a=10;
        int b=5;
        System.out.println("Addition is: "+(a+b));
    }
    int sub(int a,int b){
        int c=a-b;
        return c;
    }
    int mul(int a,int b){
        return a*b;
    }

    float div(int a,float b){
        return a/b;
    }

    int mod(int a,int b){
        return a%b;
    }


    public static void main(String[] args) {
        ArithmeticOperations obj=new ArithmeticOperations();
        //Addition
        obj.add();

        //Subtraction
        int subResult=obj.sub(23,10);
        System.out.println("Subtraction is: "+subResult);

        //Multiplication
        System.out.println("Enter 1st Number: ");
        int g=obj.sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int h=obj.sc.nextInt();
        System.out.println("Multiplication is: "+obj.mul(g,h));

        //Division
        System.out.println("Enter 1st Number: ");
        int d=obj.sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        float f=obj.sc.nextFloat();
        System.out.println("Division is: "+obj.div(d,f));

        //Modulus
        System.out.println("Modulus is : "+obj.mod(5,2));

    }
}
