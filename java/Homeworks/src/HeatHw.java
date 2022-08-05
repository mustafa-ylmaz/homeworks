import java.util.Scanner;

public class HeatHw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz:");
        int heat = scanner.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat<15 && heat > 5) {
            System.out.println("Sinemaya gidilebilirsiniz");
        }
        else if(heat > 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        }

        else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
