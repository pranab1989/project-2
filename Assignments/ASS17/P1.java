package Assignments.ASS17;
import java.util.*;
public class P1 {
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s=sc.nextLine();
        String ns="";
        int i,c;
        for(i=0;i<s.length();i++)
        {   if(s.charAt(i)!=' ')
            {c=s.charAt(i);
            c=c+3;
            if(c<='Z')
            ns=ns+(char)c;
            else
            {c=c-26;
            ns=ns+(char)c;}
            }
            if(s.charAt(i)==' ')
            ns=ns+' ';

        }


        System.out.println(ns);
    }
    
}
