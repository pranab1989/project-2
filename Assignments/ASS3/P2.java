package Assignments.ASS3;
import java.util.*;
public class P2 {
    public static void main(String[] args) {
        double r, Vol;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of Sphere:");
        r=sc.nextDouble();
        Vol=(4.0/3.0)*Math.PI*r*r*r;
        System.out.println("Volume of Sphere = "+Vol);

    }
}
