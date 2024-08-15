package Assignments.ASS8;
import java.util.*;
public class P3 {
    public static void main(String[] args) {
        int num,rem,big;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a NUMBER:");
       num=sc.nextInt();
        big=num%10;
       while(num!=0)
        {
          rem=num%10;
            if(rem>big)
            {
                big=rem;
            }
            num=num/10;
        }
        System.out.println("BIGGEST DIGIT:"+big);
    }
    
}
