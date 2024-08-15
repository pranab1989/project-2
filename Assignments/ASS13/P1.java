package Assignments.ASS13;
import java.lang.*;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,min,ind=0;
        min=Integer.MAX_VALUE;

        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();

        }
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                ind=i;
            }
        }
         System.out.print(min+" is smallest number with index "+ind);
    }
    
}
