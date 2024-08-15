package Assignments.ASS3;
import java.util.*;
public class P4 {
    public static void main(String[] args) {
        int inp_cm,out_m,out_cm;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cm:");
        inp_cm=sc.nextInt();

        out_m=inp_cm/100;
        out_cm=inp_cm%100;

        System.out.println("Metre:"+out_m+"\nCentimetre:"+out_cm);
    }
    
}
