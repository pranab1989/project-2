package Assignments.ASS17;
import java.util.*;
public class P3 {
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        System.out.print("Enter Character:");
        char c=sc.nextLine().charAt(0);
        int i;
        for(i=0;i<s.length();i++)
        {
            if(c==s.charAt(i))
            {
                break;
            }

        }
        if(i==s.length())
        System.out.println("Character Not Present in String");
        else
        System.out.println("Character Present in String");

    
    }
    
}
