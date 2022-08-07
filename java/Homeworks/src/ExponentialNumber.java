import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int n,k;
        int total=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n and k");
        n = in.nextInt();
        k = in.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println(total);
    }
}
