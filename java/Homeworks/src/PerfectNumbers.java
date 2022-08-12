import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum==n) {
            System.out.println("We have a perfect number!");
        } else {
            System.out.println("It's not so perfect.");
        }
    }
}
