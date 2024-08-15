package Assignments.ASS8;
import java.util.*;
public class P4 {
    public static void main(String[] args) 
    {   int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Final Number: ");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
            if(i%j==0)
            {
            break;
            }
            }
   
        if(j==i)
        System.out.println(i);
        }  
    }
    
}
