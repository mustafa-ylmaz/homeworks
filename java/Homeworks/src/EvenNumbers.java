import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner in = new Scanner(System.in);
        do {
        n = in.nextInt();
        if(n%2==0 && n%4==0)
            sum = n+sum;
        } while (n % 2 ==0 );
        System.out.println(sum);

    }
}
