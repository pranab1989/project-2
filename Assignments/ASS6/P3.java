package Assignments.ASS6;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks out of 100:");
        m=sc.nextInt();

        if(m>=75 && m<=100)
        System.out.println("GRADE: A");
        else if(m>=60 && m<=74)
        System.out.println("Grade: B");
        else if(m>=50 && m<60)
        System.out.println("GRADE: C");
        else if(m>=40 && m<50)
        System.out.println("GRADE: D");
        else
        System.out.println("GRADE : F");
    }
    
}
