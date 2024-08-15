package Assignments.ASS14;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        int l=s.length();
        int v=0,c=0,i;
        
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                        v++;
                else
                        c++;
        }

            }
            

        System.out.println("Vowels= "+v+"\nConsonants= "+c);
    }
    
}
