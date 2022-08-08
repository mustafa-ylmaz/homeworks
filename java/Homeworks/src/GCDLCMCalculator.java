import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd = GCD(a, b);
        int lcm = LCM(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);

    }

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }


}
