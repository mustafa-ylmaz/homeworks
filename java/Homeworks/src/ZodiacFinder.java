import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month of birth: ");
        month = input.nextInt();
        System.out.println("Enter your day of birth: ");
        day = input.nextInt();
        zodiac(month, day);
    }


    public static void zodiac(int month, int day) {

        String zodiac = "";
        if (month == 1) {
            if (day <= 20) {
                zodiac = "Capricorn";
            } else {
                zodiac = "Aquarius";
            }
        } else if (month == 2) {
            if (day <= 19) {
                zodiac = "Aquarius";
            } else {
                zodiac = "Pisces";
            }
        } else if (month == 3) {
            if (day <= 20) {
                zodiac = "Pisces";
            } else {
                zodiac = "Aries";
            }
        } else if (month == 4) {
            if (day <= 20) {
                zodiac = "Aries";
            } else {
                zodiac = "Taurus";
            }
        } else if (month == 5) {
            if (day <= 21) {
                zodiac = "Taurus";
            } else {
                zodiac = "Gemini";
            }
        } else if (month == 6) {
            if (day <= 21) {
                zodiac = "Gemini";
            } else {
                zodiac = "Cancer";
            }
        } else if (month == 7) {
            if (day <= 22) {
                zodiac = "Cancer";
            } else {
                zodiac = "Leo";
            }
        } else if (month == 8) {
            if (day <= 23) {
                zodiac = "Leo";
            } else {
                zodiac = "Virgo";
            }
        } else if (month == 9) {
            if (day <= 23) {
                zodiac = "Virgo";
            } else {
                zodiac = "Libra";
            }
        } else if (month == 10) {
            if (day <= 23) {
                zodiac = "Libra";
            } else {
                zodiac = "Scorpio";
            }
        } else if (month == 11) {
            if (day <= 22) {
                zodiac = "Scorpio";
            }


        } else if (month == 12) {
            if (day <= 22) {
                zodiac = "Sagittarius";
            } else {
                zodiac = "Capricorn";
            }
        } else {
            zodiac = "Invalid month";
        }

        System.out.println("Your zodiac sign is " + zodiac);
    }
}
