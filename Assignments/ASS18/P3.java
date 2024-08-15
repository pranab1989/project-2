package Assignments.ASS18;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class P3 {
    public static void main(String[] args) 
    {//calculator
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number1:");
        int num1=sc.nextInt();
        System.out.print("Enter Number2:");
        int num2=sc.nextInt();
        System.out.println("Press 1 to add, 2 to substract,3 to multiply and 4 to divide");
        int op=sc.nextInt();
        P3 obj=new P3();
        if(op==1)
        System.out.println("Sum:  "+obj.add(num1,num2));
        else if(op==2)
        System.out.println("Difference: "+obj.sub(num1,num2));
        else if(op==3)
        System.out.println("Product: "+obj.mul(num1,num2));
        else if(op==4)
        System.out.println("Quotient: "+obj.div(num1,num2));
             
      
    }
    int add(int x,int y)
    {
        return x+y;
    }
    int sub(int x, int y)
    {
        if(x>=y)
        return x-y;
        else
        return y-x;
    }
    int mul(int x, int y)
    {
        return x*y;
    }
    int div(int x, int y)
    {
        if(x>=y)
        return x/y;
        else
        return y/x;

    }
    
}
