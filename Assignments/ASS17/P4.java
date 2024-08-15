package Assignments.ASS17;
import java.util.*;

public class P4 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        String sarr[]=s.split(" ");
        int i;
        String ns="",word="";
        for(i=0;i<sarr.length;i++)
        {
             word=sarr[i];
            char ch=word.charAt(0);
            ch=Character.toUpperCase(ch);
            ns=ns+ch+word.substring(1)+" ";
                 
        }
        
        System.out.println(ns);
    
                     
        }

        
       
        
    }
    

