package Assignments.ASS10;

public class P2 {
    public static void main(String[] args)
    {
        int i,j,s,k,t;
        for(i=1;i<=4;i++)
        {
            for(s=i;s<=3;s++)
            {
                System.out.print("  ");
            }
            k=1;
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k+=2;
            }
              k-=2;
            for(j=i-1;j>=1;j--)
            {
                k-=2;
              System.out.print(k+" ");
            }
            System.out.println();
        }
        
    }
    
}
