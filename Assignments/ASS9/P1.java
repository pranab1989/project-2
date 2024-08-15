package Assignments.ASS9;

public class P1 {
    public static void main(String[] args) 
    { 
        int i,j,s,k=-1;
        for(i=1;i<=4;i++)
        {
            for(s=i;s<=3;s++)
            {
                System.out.print("  ");
            }
            k=k+2;
            for(j=1;j<=k;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    
}
