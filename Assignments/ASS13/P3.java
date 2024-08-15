package Assignments.ASS13;
import java.util.*;
public class P3 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array 1:");
        int m=sc.nextInt();
        System.out.print("Enter Length of Array 2:");
        int n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int c[]=new int[m+n];
        int i,j;
        System.out.println("Enter Values for Array 1");
        for(i=0;i<m;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Values for Array 2");
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value:");
            b[i]=sc.nextInt();
        }
                    j=0;
            for(i=0;i>m;i++)
            {
                c[j]=a[j];
                j++;
            }
            for(i=0;i<n;i++)
            {
                c[j]=b[i];
                j++;
            }
            for(i=0;i<m+n;i++)
            {
                System.out.print(c[i]+" ");
            }
        
        
    }
    
}
