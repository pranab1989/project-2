package Stex;
import java.util.Scanner;
public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the full name: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        String lastName = words[words.length - 1];
        String result = lastName + ", ";
        for (int i = 0; i < words.length - 1; i++) 
        {
            result += words[i].charAt(0) + ".";
        }
        System.out.println("Formatted name:");
        System.out.println(result);
    }
}