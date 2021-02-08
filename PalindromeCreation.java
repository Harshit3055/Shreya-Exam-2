import java.util.*;
public class PalindromeCreation {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = in.next();
        String a2 = a;
        char ch;
        int len = a.length();
        for(int i = len-2;i>=0;i--)
        {
            ch = a.charAt(i);
           a2 = a2+ch;
        }
        System.out.println("The Palindrome String is = "+a2);
    }
}
