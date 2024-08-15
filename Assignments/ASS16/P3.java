package Assignments.ASS16;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        s=" "+s;
        String w="",ns="";
        for(int i=s.length()-1;i>=0;i--)
        {        
            if(s.charAt(i)==' ')
            {  
                 ns=ns+w;
                 ns=ns+" ";  
                 w=""; 
                 
            } 
            else
            w=s.charAt(i)+w;        
            
        }
        System.out.println(ns);
        
    }
    
}
