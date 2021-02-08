import java.util.*;
public class Func {
    public void Large(int num1, int num2, int num3)
    {
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("The Largest Number = "+max);
    }
    public static void main(String agrs[])
    {
        Func Sheru = new Func();
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        Sheru.Large(a, b, c);
    }

}
