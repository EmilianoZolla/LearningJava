package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String vacationType = "";
        double expenses = 0.0;

        if (budget <= 100){
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            destination = "Balkans";
        } else if (budget > 1000) {
            destination = "Europe";
        }
        System.out.println("Somewhere in " + destination);

        switch (destination){
            case "Bulgaria":
                if (season.equals("summer")){
                    vacationType = "Camp";
                    expenses = budget * 0.3;
                } else {
                    vacationType = "Hotel";
                    expenses = budget * 0.7;
                }
                break;
            case "Balkans":
                if (season.equals("summer")){
                    vacationType = "Camp";
                    expenses = budget * 0.4;
                } else {
                    vacationType = "Hotel";
                    expenses = budget * 0.8;

                }
                break;
            case "Europe":
                vacationType = "Hotel";
                expenses = budget * 0.9;
                break;
        }
        System.out.printf("%s - %.2f", vacationType, expenses);
    }
}