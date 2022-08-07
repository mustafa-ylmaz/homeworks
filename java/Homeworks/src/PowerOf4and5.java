import java.util.Scanner;

public class PowerOf4and5 {
    public static void main(String[] args) {

        int num;

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number : ");
        num= inp.nextInt();

        System.out.println("Power Of Four : ");
        for (int i=1;i<=num;i*=4){
            System.out.println(i);
        }
        System.out.println("Power Of Five : ");
        for (int j=1;j<num;j*=5){
            System.out.println(j);
        }
    }


}
