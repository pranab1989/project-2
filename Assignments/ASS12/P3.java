package Assignments.ASS12;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
              b[i]=a[i]*a[i];
            else
            b[i]=a[i]*a[i]*a[i];  
    
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
        
    }

    
}
