

public class ANAGRAM {
    public static void main(String[] args) {
        

    static int NO_OF_CHARS = 256;
    /* Driver code*/
    public static void main(String args[])
    {
        char str1[] = ("ram").toCharArray();
        char str2[] = ("arm").toCharArray();
        if(str1.length!=str2.length)
        {
            System.out.println("Not an Anagram");
            return;
        }
        // Function call
        int count1[] = new int[NO_OF_CHARS];
        int count2[] = new int[NO_OF_CHARS];
        int i;
        for (i = 0; i < str1.length;i++) 
        {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
       
        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++)
        {
            if (count1[i] != count2[i])
                break;
        }
        if(i==NO_OF_CHARS)
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
}
    
    

