package Assignments.ASS3;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        
    
    int m,oh,om;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter minutes:");
        m=sc.nextInt();

        oh=m/60;
        om=m%60;

        System.out.println("Hours:"+oh+"\nMinutes:"+om);
    }
}
