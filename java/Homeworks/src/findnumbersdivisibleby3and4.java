import java.util.Scanner;

public class findnumbersdivisibleby3and4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            if(i%3==0 && i%4==0)
                System.out.println(i);
        }


    }
}

