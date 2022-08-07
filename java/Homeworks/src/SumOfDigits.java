import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");


        int num = sc.nextInt();

        int piece = 0,sum=0;

        while(num != 0)
        {
            sum +=  (num%10);
            num /= 10;
            ++piece;
        }
        System.out.println("Number of digits : " + piece);
        System.out.println("Sum of digits: " + sum);

    }

}
