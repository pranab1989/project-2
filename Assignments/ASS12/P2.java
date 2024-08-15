package Assignments.ASS12;
import java.util.*;
public class P2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Arrays");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int i;
        System.out.println("Enter values for Array 1");
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter values for Array 2");
        for(i=0;i<n;i++)
        {
            System.out.print("Enter Value: ");
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)    
        {
            c[i]=a[i]*b[i];
            System.out.print(c[i]+" ");
        }
    
    
    }

    
}
