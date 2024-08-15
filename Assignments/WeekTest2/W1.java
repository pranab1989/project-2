package Assignments.WeekTest2;
import java.util.*;
public class W1 {
    public static void main(String[] args) 
    {
        int x,num,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        x=sc.nextInt();
        num=x;
        while(x!=0)
        {
          rem=x%10;
          rev=rev*10+rem;
          x=x/10;
        }
        if(rev==num)
        System.out.println(num+" is Palendrome");
        else
        System.out.println(num+" is not Palendrome");
        
    }
    
}
