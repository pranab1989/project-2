package Assignments.ASS18;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=sc.nextInt();
        System.out.print("Enter Second Number:");
        int b=sc.nextInt();
        P1 obj=new P1();
        System.out.println("Sum:"+obj.add(a,b));

        
    }
    int add(int x,int y)
    {
        return x+y;
    }
    
}
