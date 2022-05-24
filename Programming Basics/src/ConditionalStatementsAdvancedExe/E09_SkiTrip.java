package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String review = scanner.nextLine();
        int nights = days - 1;
        double roomCost = 0.0;
        double discount = 0.0;
        switch (typeOfRoom){
            case "room for one person":
                discount = 1;
                roomCost = 18.00;
                break;
            case "apartment":
                roomCost = 25.00;
                if (nights < 10){
                    discount = 0.7;
                } else if (nights <= 15){
                    discount = 0.65;
                } else {
                    discount = 0.5;
                }
                break;
            case "president apartment":
                roomCost = 35.00;
                if (nights < 10){
                    discount = 0.9;
                } else if (nights <= 15){
                    discount = 0.85;
                } else {
                    discount = 0.8;
                }
                break;
        }
        double totalPrice = roomCost * nights * discount;
        if (review.equals("positive")){
            System.out.printf("%.2f", (totalPrice * 1.25));
        } else if (review.equals("negative")){
            System.out.printf("%.2f", (totalPrice * 0.9));
        }
    }
}
