import java.util.*;
public class StringReverse {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Word");
        String Wrd = in.nextLine();
        String Wrd2 = "";
        int len = Wrd.length();
        char ch;
        for(int i=len-1;i>=0;i--)
        {
            ch = Wrd.charAt(i);
            Wrd2 = Wrd2+ch;
        }
        if(Wrd.equalsIgnoreCase(Wrd2))
        {
            System.out.println("Its ia a Palindrome");
        }
        else
        {
            System.out.println("Its not a Palindrome");
        }
    }
}
