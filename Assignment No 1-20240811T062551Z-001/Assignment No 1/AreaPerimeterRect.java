public class AreaPerimeterRect {
    public static void main(String[] args) {
        float length=40;
        float width=20;

        AreaPerimeterRect obj=new AreaPerimeterRect();

        System.out.println("Area of rectangle is: "+obj.area(length,width));
        System.out.println("Perimeter of rectangle is: "+obj.perimeter(length,width));
    }

    float perimeter(float l,float w){
        return 2*(l+w);
    }

    float area(float l,float w){
        return l*w;
    }
}
