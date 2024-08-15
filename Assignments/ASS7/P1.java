package Assignments.ASS7;
import java.util.*;
public class P1 {
    public static void main(String[] args) {
        int pro=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int n=sc.nextInt();
        System.out.print("Enter Exponent:");
        int e=sc.nextInt();
        for(int i=1;i<=e;i++)
        {
            pro=pro*n;
        }
        System.out.println(pro);

    }
    
}
