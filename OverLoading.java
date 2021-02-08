import java.util.*;
public class OverLoading {
    static void Large(int num1, int num2, int num3)
    {
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("The Largest Number = "+max);
    }
    static void Large(double num4, double num5, double num6)
    {
        System.out.println("Arya(Chimkandi) is very Ugly!");
    }
    public static void main(String agrs[])
    {
        double a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        Large(a, b, c);
    }
}