package ForLoopExe;

import java.util.Scanner;

public class E04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        double moneyGathered = 0.0;
        double moneySaved = 0;
        double idiotBrother = 0.0;
        for ( int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyGathered = moneyGathered + 10;
                moneySaved = moneySaved + moneyGathered;
                idiotBrother++;
            } else {
                toyCount = toyCount + 1;
            }
        }
        double totalAmountGathered = moneySaved + (toyCount * toyPrice) - idiotBrother;
        if (totalAmountGathered >= washerPrice){
            System.out.printf("Yes! %.2f", (totalAmountGathered - washerPrice));
        } else {
            System.out.printf("No! %.2f",Math.abs(totalAmountGathered - washerPrice));
        }
    }
}