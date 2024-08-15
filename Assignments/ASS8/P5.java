package Assignments.ASS8;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        int num,rem,count=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a NUMBER:");
       num=sc.nextInt();
        
       while(num!=0)
        {
          rem=num%10;
            count++;
            num=num/10;
        }
        System.out.println("Number of Digits:"+count);

    }
    
}
