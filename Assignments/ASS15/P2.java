package Assignments.ASS15;
import java.util.*;
import java.lang.*;
public class P2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        String ns="";
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                  ch=Character.toLowerCase(ch);
                else 
                  ch=Character.toUpperCase(ch);  
            }
            else
            ns=ns+ch;

        }
          System.out.println(ns);
        
    }
    
}
