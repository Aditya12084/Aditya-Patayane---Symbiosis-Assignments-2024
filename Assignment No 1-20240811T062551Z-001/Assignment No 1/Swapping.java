public class Swapping {
    public static void main(String[] args) {

        //Swapping using third variable
        int k=10,l=20,temp=0;
        System.out.println("Before swapping: k="+k+", l="+l);
        temp=k;
        k=l;
        l=temp;
        System.out.println("Before swapping: k="+k+",l="+l);

        //Swapping without using a third variable
        int a=5;
        int b=2;

        System.out.println("Before swapping: a="+a+", b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a="+a+", b="+b);
    }
}
