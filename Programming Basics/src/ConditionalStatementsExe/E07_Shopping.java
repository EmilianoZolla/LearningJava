package ConditionalStatementsExe;

import java.util.Scanner;

public class E07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = 250.0;
        double processorPrice = ( videoCards * videoCardsPrice) * 0.35;
        double ramPrice = (videoCards * videoCardsPrice) * 0.1;

        double totalPrice = (videoCards * videoCardsPrice) + (processor * processorPrice) + (ram * ramPrice);

        if (videoCards > processor) {
            totalPrice = totalPrice * 0.85;
        }
        double diffrence = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", diffrence);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diffrence);
        }

    }

}