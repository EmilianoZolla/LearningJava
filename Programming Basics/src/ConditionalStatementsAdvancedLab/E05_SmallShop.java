package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E05_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double coffee = 0.0;
        double water = 0.0;
        double beer = 0.0;
        double sweets = 0.0;
        double peanuts = 0.0;
        switch (city) {
            case "Sofia":
                coffee = 0.5;
                water = 0.8;
                beer = 1.2;
                sweets = 1.45;
                peanuts = 1.6;
                break;
            case "Plovdiv":
                coffee = 0.4;
                water = 0.7;
                beer = 1.15;
                sweets = 1.30;
                peanuts = 1.50;
                break;
            case "Varna":
                coffee = 0.45;
                water = 0.7;
                beer = 1.1;
                sweets = 1.35;
                peanuts = 1.55;
                break;
        }
        if (product.equals("coffee")) {
            System.out.println(coffee * quantity);
        } else if (product.equals("water")) {
            System.out.println(water * quantity);
        } else if (product.equals("beer")) {
            System.out.println(beer * quantity);
        } else if (product.equals("sweets")) {
            System.out.println(sweets * quantity);
        } else if (product.equals("peanuts")) {
            System.out.println(peanuts * quantity);
        }
    }

}