package Assignments.ASS16;
import java.util.*;
public class P1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        int wcnt=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                break;
            }
            wcnt++;
        }
        System.out.println("Length of last Word: "+wcnt);
    }

    
}
