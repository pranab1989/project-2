package Assignments.ASS14;
import java.util.*;
public class P3 {
    public static void main(String[] args) 
    {
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter String:");
          String s=sc.nextLine();
          int l=s.length();
          String rev="";
          int i;
          for(i=0;i<l;i++)
          {
            char ch=s.charAt(i);
            rev=ch+rev;

          }
          if(rev.equalsIgnoreCase(s))
          System.out.println("Palindrome");
          else
          System.out.println("Not a Palindrome");
        
    }
    
}
