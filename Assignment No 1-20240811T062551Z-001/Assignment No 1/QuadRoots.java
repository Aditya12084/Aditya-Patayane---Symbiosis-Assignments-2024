public class QuadRoots {
    public static void main(String[] args) {
        int a=6,b=-18,c=-3;

        float disc=(b*b)-(4*a*c);

        float x1= (float) (-(b)+Math.sqrt(disc))/(2*a);
        float x2= (float) (-(b)-Math.sqrt(disc))/(2*a);

        System.out.println("Factors for qudratic equation are :"+  x1 +" & "+ x2);
    }
}
