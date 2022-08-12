import java.util.Scanner;

public class FindingMinMaxValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
    }
}
