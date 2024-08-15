package Assignments.ASS7;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter more than 2 digit Number:");
        int n=sc.nextInt();
        int rem,sum=0;
        while(n!=0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                sum=sum+rem;
            }
            n=n/10;
        }
        System.out.println("Sum of Even Numbers= "+sum);
    }
    
}
