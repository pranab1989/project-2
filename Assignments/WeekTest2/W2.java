package Assignments.WeekTest2;

public class W2 {
    public static void main(String[] args) 
    { int i,j;

        for(i=1;i<=5;i++)
        {
            for(j=i;j>=1;j--)
            {  
                if(j%2==0)
                System.out.print("$"+" ");
                else
                System.out.print("@"+" ");
                           
            }
            System.out.println();
        }
        
    }
    
}
