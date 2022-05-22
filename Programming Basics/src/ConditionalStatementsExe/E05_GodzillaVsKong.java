package ConditionalStatementsExe;

import java.util.Scanner;

public class E05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        if (extras > 150) {
            clothes = clothes * 0.9;
        }
        double costs = (extras * clothes) + decor;
        if (costs <= budget) {
            double moneyLeft = budget - costs;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);

        } else {
            double moneyNeeded = Math.abs(budget-costs);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        }


    }
}