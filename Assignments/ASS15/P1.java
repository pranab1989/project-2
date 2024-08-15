package Assignments.ASS15;
import java.util.*;
public class P1 {
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
            if(ch!=' ')
             ns=ns+ch;
            
        
        }

         System.out.println(ns);

        
    }
    
}
