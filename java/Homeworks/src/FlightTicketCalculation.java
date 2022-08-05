import java.util.Scanner;

public class FlightTicketCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz");
        double distance = scanner.nextInt();
        System.out.println("Yaşınızı giriniz");
        double age = scanner.nextInt();
        System.out.println("Yolculuk tipinizi giriniz (1=>Tek Yön, 2=>Gidiş-Dönüş)");
        double type = scanner.nextInt();

        double price = 0;
        double ageDiscount = 0;
        double discountPrice= 0;
        double roundTripDiscountPrice = 0;

        double totalPrice = 0;
        if(age<0 || distance<0 || type<1 || type>2){
            System.out.println("Hatalı giriş");
        }

        else if (age<12) {
            price = distance * 0.10;
            ageDiscount = price * 0.50;
            discountPrice = price - ageDiscount;
            totalPrice = discountPrice;
            if(type==2) {
                roundTripDiscountPrice = discountPrice * 0.20;
                totalPrice = (totalPrice - roundTripDiscountPrice)*2;
            }
            System.out.println("Ucretiniz: " + totalPrice);

        } else if (age>12 && age<24) {
            price = distance * 0.10;
            ageDiscount = price * 0.10;
            discountPrice = price - ageDiscount;
            totalPrice = discountPrice;
            if(type==2) {
                roundTripDiscountPrice = discountPrice * 0.20;
                totalPrice = (totalPrice - roundTripDiscountPrice)*2;
            }
            System.out.println("Ucretiniz: " + totalPrice);


        } else if (age>65) {
            price = distance * 0.10;
            ageDiscount = price * 0.30;
            discountPrice = price - ageDiscount;
            totalPrice = discountPrice;
            if(type==2) {
                roundTripDiscountPrice = discountPrice * 0.20;
                totalPrice = (totalPrice - roundTripDiscountPrice)*2;
            }
            System.out.println("Ucretiniz: " + totalPrice);


        }


    }



}
