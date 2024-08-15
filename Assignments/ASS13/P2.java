package Assignments.ASS13;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,min,sec_min;
        min=Integer.MAX_VALUE;
        sec_min=Integer.MAX_VALUE;

        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();

        }

        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                sec_min=min;
                min=a[i];
            }
            else if(a[i]<sec_min && a[i]!=min)
            {
                sec_min=a[i];
            }
           
        }
        System.out.print("Second Smallest Number is "+sec_min);
        
    }
    
}
