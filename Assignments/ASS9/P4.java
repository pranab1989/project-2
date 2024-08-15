package Assignments.ASS9;
import java.util.*;
public class P4 {
    public static void main(String[] args)
    {   int i,rem,x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Limit to check Duck Numbers:");
        int num=sc.nextInt();

        for(i=1;i<=num;i++)
        {  x=i;
            while(x!=0)
            {
                rem=x%10;
                if(rem==0)
                {   
                    System.out.println(x);
                    break;
                }
                x=x/10;
            }
        }

    }
    
}
