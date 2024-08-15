package Assignments.ASS6;
import java.util.*;
public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        if(n%2==0 && n%5==0)
        System.out.println("NUMBER DIVISIBLE BY 2 & 5");
        else if(n%2==0 && n%5!=0)
        System.out.println("NUMBER DIVISIBLE BY 2 BUT NOT BY 5");
        else if(n%5==0 && n%2!=0)
        System.out.println("NUMBER DIVISIBLE BY 5 BUT NOT BY 2");
        else
        System.out.println("ENTERED NUMBER IS NOT DIVISIBLE BY 2 OR 5");

    }
    
}
