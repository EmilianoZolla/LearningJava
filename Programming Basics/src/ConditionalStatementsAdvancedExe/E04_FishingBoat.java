package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0.0;
        if (season.equals("Spring")){
            boatPrice = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")   ){
            boatPrice = 4200;
        } else if (season.equals("Winter")){
            boatPrice = 2600;
        }
        if (fisherman <= 6){
            boatPrice = boatPrice * 0.9;
        } else if (fisherman <= 11) {
            boatPrice = boatPrice * 0.85;
        } else if (fisherman >= 12) {
            boatPrice = boatPrice * 0.75;
        }
        if (fisherman  % 2 == 0 && (season.equals("Spring") || season.equals("Summer") || season.equals("Winter"))){
            boatPrice = boatPrice * 0.95;
        }
        if (budget >= boatPrice){
            System.out.printf("Yes! You have %.2f leva left.", (budget - boatPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - boatPrice));
        }
    }
}
