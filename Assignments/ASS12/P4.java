package Assignments.ASS12;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Arrays");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,max,ind=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }
        max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                ind=i;
            }
        }
        System.out.print("Biggest No. is "+max+" at index "+ind);

    }
    
}
