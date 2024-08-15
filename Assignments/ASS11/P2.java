package Assignments.ASS11;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,sum=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
             sum+=a[i];
        }
        System.out.print("Sum:"+sum);
    }
    
}
