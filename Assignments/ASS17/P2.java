package Assignments.ASS17;
import java.util.*;
public class P2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1=sc.nextLine();
        System.out.print("Enter String 2:");
        String s2=sc.nextLine();
        int i;
        String ns="";
        int max=Math.max(s1.length(),s2.length());
        for(i=0;i<max;i++)
        {
            if(i<s1.length())
            ns=ns+s1.charAt(i);

            if(i<s2.length())
            ns=ns+s2.charAt(i);
        }

       System.out.println(ns); 
    }
    
}
