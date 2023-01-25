package basicSyntaxExe;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.next();
        String dayOfWeek = scanner.next();
        double fridayPrice = 0;
        double saturdayPrice = 0;
        double sundayPrice = 0;
        double totalPrice = 0;

        switch (typeOfPeople){
            case "Students":
                fridayPrice = 8.45;
                saturdayPrice = 9.80;
                sundayPrice = 10.46;
                if (dayOfWeek.equals("Friday")){
                    totalPrice = fridayPrice * numberOfPeople;
                }else if (dayOfWeek.equals("Saturday")){
                    totalPrice = saturdayPrice * numberOfPeople;
                }else if(dayOfWeek.equals("Sunday")){
                    totalPrice = sundayPrice * numberOfPeople;
            }
                if(numberOfPeople >= 30){
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Business":
                fridayPrice = 10.90;
                saturdayPrice = 15.60;
                sundayPrice = 16;
                if (numberOfPeople >= 100) {
                    if (dayOfWeek.equals("Friday")) {
                        totalPrice = fridayPrice * (numberOfPeople - 10);
                    } else if (dayOfWeek.equals("Saturday")) {
                        totalPrice = saturdayPrice * (numberOfPeople - 10);
                    } else if (dayOfWeek.equals("Sunday")) {
                        totalPrice = sundayPrice * (numberOfPeople - 10);
                    }
                } else {
                    if (dayOfWeek.equals("Friday")) {
                        totalPrice = fridayPrice * numberOfPeople;
                    } else if (dayOfWeek.equals("Saturday")) {
                        totalPrice = saturdayPrice * numberOfPeople;
                    } else if (dayOfWeek.equals("Sunday")) {
                        totalPrice = sundayPrice * numberOfPeople;
                    }
                }
                break;
            case "Regular":
                fridayPrice = 15;
                saturdayPrice = 20;
                sundayPrice = 22.50;
                if (dayOfWeek.equals("Friday")) {
                    totalPrice = fridayPrice * numberOfPeople;
                } else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = saturdayPrice * numberOfPeople;
                } else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = sundayPrice * numberOfPeople;
                }
                if (numberOfPeople >= 10 && numberOfPeople <= 20){
                    totalPrice = totalPrice * 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
