package basicSyntaxExe;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String dayOfWeekend = scanner.nextLine();
        double pricePerNight = 0.0;
        double price = 0.0;
        double totalPrice = 0.0;
        if (peopleType.equals("Students")){
            if (dayOfWeekend.equals("Friday")){
                pricePerNight = 8.45;
            } else if (dayOfWeekend.equals("Saturday")){
                pricePerNight = 9.80;
            } else if (dayOfWeekend.equals("Sunday")){
                pricePerNight = 10.46;
            }
            price = peopleCount * pricePerNight;
            if (peopleCount >= 30) {
                totalPrice = price * 0.85;
            } else {
                totalPrice = price;
            }

        } else if (peopleType.equals("Business")){
            if (dayOfWeekend.equals("Friday")){
                pricePerNight = 10.90;
            } else if (dayOfWeekend.equals("Saturday")){
                pricePerNight = 15.60;
            } else if (dayOfWeekend.equals("Sunday")){
                pricePerNight = 16;
            }
            price = peopleCount * pricePerNight;
            if (peopleCount >= 100) {
                totalPrice = price - (10*pricePerNight);
            } else {
                totalPrice = price;
            }

        } else if (peopleType.equals("Regular")){
            if (dayOfWeekend.equals("Friday")){
                pricePerNight = 15;
            } else if (dayOfWeekend.equals("Saturday")){
                pricePerNight = 20;
            } else if (dayOfWeekend.equals("Sunday")){
                pricePerNight = 22.50;
            }
            price = peopleCount * pricePerNight;
            if (peopleCount >= 10 && peopleCount <= 20 ) {
                totalPrice = price * 0.95;
            } else {
                totalPrice = price;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
