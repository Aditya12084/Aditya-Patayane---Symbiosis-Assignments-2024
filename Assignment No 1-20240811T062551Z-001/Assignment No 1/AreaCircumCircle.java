import java.util.Scanner;
public class AreaCircumCircle {
    float areaOfCircle(float r){
         return  (float) (3.14*r*r);
    }

    float circumOfCircle(float r){
        return (float) (2*3.14*r);
    }

    public static void main(String[] args) {
     AreaCircumCircle obj=new AreaCircumCircle();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter radius of circle: ");
     float radius=sc.nextFloat();
     float area=obj.areaOfCircle(radius);
     System.out.println("Area of circle: "+area);

     System.out.println("Circumference of circle: "+obj.circumOfCircle(radius));
    }
}
