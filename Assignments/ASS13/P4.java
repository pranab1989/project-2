package Assignments.ASS13;

public class P4 {
    public static void main(String[] args) 
    {
       int a[]={6,8,7,10,9,12};
       int i,fdig,sdig;
       for(i=0;i<3;i++)
       {
        fdig=a[i];
        sdig=a[i+3];
        a[i]=sdig;
        a[i+3]=fdig;
       }
        for(i=0;i<6;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
