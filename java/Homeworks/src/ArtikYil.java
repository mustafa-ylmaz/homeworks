import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean isArtikYil = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        yil = input.nextInt();
        if (yil>0){
            if (yil%4==0 || (yil%100==0 && yil%400==0 )  ){
                isArtikYil=true;
            }else {
                isArtikYil=false;
            }

        }else {
            System.out.println("Gecersiz yil girdiniz.");
        }
        if (isArtikYil==true){
            System.out.println("Artik yildir.");
        }else {
            System.out.println("Artik Yil Degildir.");
        }
    }
}