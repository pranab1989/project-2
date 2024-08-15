package Assignments.ASS11;
import java.util.*;
public class P1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }
        for (i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    
        

    }
    
}
