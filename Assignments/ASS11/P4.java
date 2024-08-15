package Assignments.ASS11;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,avg,sum=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            sum+=a[i];
        }
        avg=sum/n;
        System.out.println("Average: "+avg);
    }
    
}
