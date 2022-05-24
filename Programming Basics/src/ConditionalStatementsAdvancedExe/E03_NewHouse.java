package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double rosesPrice = 5;
        double dahliasPrice = 3.8;
        double tulipsPrice = 2.8;
        double narcissusPrice = 3;
        double gladiolusPrice = 2.5;

        double flowerPrice = 0.0;
        switch (flower) {
            case "Roses":
                if (flowerCount > 80) {
                    flowerPrice = (flowerCount * rosesPrice) * 0.9;
                } else {
                    flowerPrice = (flowerCount * rosesPrice);
                }
                break;
            case "Dahlias":
                if (flowerCount > 90) {
                    flowerPrice = (flowerCount * dahliasPrice) * 0.85;
                } else {
                    flowerPrice = (flowerCount * dahliasPrice);
                }
                break;
            case "Tulips":
                if (flowerCount > 80) {
                    flowerPrice = (flowerCount * tulipsPrice) * 0.85;
                } else {
                    flowerPrice = (flowerCount * tulipsPrice);
                }
                break;
            case "Narcissus":
                if (flowerCount < 120) {
                    flowerPrice = (flowerCount * narcissusPrice) * 1.15;
                } else {
                    flowerPrice = (flowerCount * narcissusPrice);
                }
                break;
            case "Gladiolus":
                if (flowerCount < 80) {
                    flowerPrice = (flowerCount * gladiolusPrice) * 1.20;
                } else {
                    flowerPrice = (flowerCount * gladiolusPrice);
                }
                break;
        }
        if (budget >= flowerPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flower, (budget-flowerPrice));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (Math.abs(flowerPrice - budget)));
        }
    }
}
