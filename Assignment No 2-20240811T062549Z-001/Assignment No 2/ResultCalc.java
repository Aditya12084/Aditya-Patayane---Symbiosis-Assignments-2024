import java.awt.*;

public class ResultCalc {
    public static void main(String[] args) {
        float total=0;
        java.util.Scanner sc=new  java.util.Scanner(System.in);
        int marks[]=new int[6];
        String subs[]={"MATHS","DWM","IP","PCE","SE","AI"};

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter marks of "+subs[i]+" :");
            marks[i]=sc.nextInt();
            total+=marks[i];
        }

        int passingMarks=32;

        float percentage= (total * 100) / 480;

        System.out.println("Total marks obtained: "+total);
        System.out.println("Obtained percentage: "+percentage+"%");

        int failCounter=0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]<passingMarks){
                failCounter++;
            }
        }
        if(failCounter>0){
            System.out.println("Failed in subjects: ");
            for (int i = 0; i < marks.length; i++) {
                if(marks[i]<passingMarks){
                    System.out.println(subs[i]);
                }
            }
        }

        System.out.println("No of failed subjects: "+failCounter);

        if(failCounter>5){
            System.out.println("FAIL");
        }
        else{
            if(failCounter!=0){
                System.out.println("KT");
            }
            else{
                System.out.println("PASS");
            }
        }
    }
}
