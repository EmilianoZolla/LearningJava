package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        if (month.equals("May") || month.equals("October")){
            studioPrice = 50;
            apartmentPrice = 65;
            if (nights > 7 && nights < 14) {
                studioPrice = studioPrice * 0.95;
            } else if (nights > 14) {
                studioPrice = studioPrice * 0.7;
                apartmentPrice = apartmentPrice * 0.9;
            }

        } else if (month.equals("June") || month.equals("September")){
            studioPrice = 75.2;
            apartmentPrice = 68.7;
            if (nights > 14) {
                studioPrice = studioPrice * 0.8;
                apartmentPrice = apartmentPrice * 0.9;

            }
        } else if (month.equals("July") || month.equals("August")){
            studioPrice = 76;
            apartmentPrice = 77;
            if (nights > 14){
                apartmentPrice = apartmentPrice * 0.9;
            }
        }
        double totalPriceStudio = studioPrice * nights;
        double totalPriceApartment = apartmentPrice * nights;
        System.out.printf("Apartment: %.2f lv.",totalPriceApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}