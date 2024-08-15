package Assignments.ASS3;
import java.util.*;
public class P3 {
    public static void main(String[] args) {
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temp in Farhenheit:");
        f=sc.nextDouble();
        c=(5.0/9.0)*(f-32.0);
        System.out.println("Temperature in Celsius:"+c+"degree Celsius");
    }
    
}
