package Assignments.ASS12;
import java.util.*;
public class P1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int i;
        for(i=0;i<5;i++)
        {
            System.out.print("Enter Value:");
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            b[i]=a[i]*a[i];
            System.out.println(b[i]+" ");
        }

         
        
    }
    
}
