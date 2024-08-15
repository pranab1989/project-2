package Assignments.ASS18;
import java.util.*;
public class P2 {
    public static void main(String[] args) 
    {//Factorial of a Number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        P2 obj=new P2();
        obj.fact(num);
        
    }

    void fact(int n)
    {
        int f=1;
        for(int i=n;i>=1;i--)
        {
             f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);
    }
    
}
