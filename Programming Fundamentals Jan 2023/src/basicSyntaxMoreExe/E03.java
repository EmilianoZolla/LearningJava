package basicSyntaxMoreExe;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double outFallPrice = 39.99;
        double csPrice = 15.99;
        double zplinterPrice = 19.99;
        double honoredPrice = 59.99;
        double roverPrice = 29.99;
        double roverOriginPrice = 39.99;
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double totalSpend = 0;
        String currentGame = scanner.nextLine();
        while ((!currentGame.equals("Game Time")) && currentBalance > 0){
                switch (currentGame){
                    case "OutFall 4":
                        if (currentBalance - outFallPrice >= 0) {
                            currentBalance -= outFallPrice;
                            totalSpend +=outFallPrice;
                            System.out.println("Bought OutFall 4");
                            if (currentBalance <= 0){
                                System.out.println("Out of money!");
                                } else {
                                currentGame = scanner.nextLine();
                                }

                        } else {
                            System.out.println("Too Expensive");
                            currentGame = scanner.nextLine();
                        }
                        break;

                    case "CS: OG":
                        if (currentBalance - csPrice >= 0) {
                            currentBalance -= csPrice;
                            totalSpend += csPrice;
                            System.out.println("Bought CS: OG");
                            if (currentBalance <= 0){
                                System.out.println("Out of money!");
                            } else {
                                currentGame = scanner.nextLine();
                            }
                        } else {
                            System.out.println("Too Expensive");
                            currentGame = scanner.nextLine();
                        }
                        break;
                    case "Zplinter Zell":
                        if (currentBalance - zplinterPrice >= 0){
                            currentBalance -= zplinterPrice;
                            totalSpend += zplinterPrice;
                            System.out.println("Bought Zplinter Zell");
                            if (currentBalance <= 0){
                                System.out.println("Out of money!");
                            } else {
                                currentGame = scanner.nextLine();
                            }
                        } else {
                            System.out.println("Too Expensive");
                            currentGame = scanner.nextLine();
                        }
                        break;
                    case "Honored 2":
                        if (currentBalance - honoredPrice >= 0){
                            currentBalance -= honoredPrice;
                            totalSpend+=honoredPrice;
                            System.out.println("Bought Honored 2");
                            if (currentBalance <= 0){
                                System.out.println("Out of money!");
                            } else {
                                currentGame = scanner.nextLine();
                            }
                        } else {
                            System.out.println("Too Expensive");
                            currentGame = scanner.nextLine();
                        }
                        break;
                    case "RoverWatch":
                        if (currentBalance - roverPrice >= 0){
                            currentBalance -= roverPrice;
                            totalSpend+=roverPrice;
                            System.out.println("Bought RoverWatch");
                            if (currentBalance <= 0){
                                System.out.println("Out of money!");
                            } else {
                                currentGame = scanner.nextLine();
                            }
                        } else {
                            System.out.println("Too Expensive");
                            currentGame = scanner.nextLine();
                        }
                        break;
                    case "RoverWatch Origins Edition":
                        if (currentBalance - roverOriginPrice >= 0){
                            currentBalance -= roverOriginPrice;
                            totalSpend += roverOriginPrice;
                            System.out.println("Bought RoverWatch Origins Edition");
                            if (currentBalance <= 0){
                                System.out.println("Out of money!");
                            } else {
                                currentGame = scanner.nextLine();
                            }
                        } else {
                            System.out.println("Too Expensive");
                            currentGame = scanner.nextLine();
                        }
                        break;
                    default:
                        System.out.println("Not Found");
                        currentGame = scanner.nextLine();
            }
        }
        if (currentBalance > 0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend, currentBalance);
        }
    }
}
