package Assignments.ASS9;

public class P3 {
    public static void main(String[] args) 
    {
        int i,j,s;
        for(i=1;i<=5;i++)
        {
            for(s=1;s<=i-1;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(6-i);j++)
            {
                System.out.print(j+" ");
            }
           System.out.println();
        }
    }
    
}
