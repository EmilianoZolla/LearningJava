package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        if (city.equals("Sofia")){
            if (salesVolume < 0) {
                System.out.println("error");
            } else if (salesVolume <= 500) {
                commission = 0.05;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume <= 1000) {
                commission = 0.07;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume <= 10000) {
                commission = 0.08;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume > 10000) {
                commission = 0.12;
                System.out.printf("%.2f", (salesVolume * commission));
            }
        } else if (city.equals("Varna")){
            if (salesVolume < 0) {
                System.out.println("error");
            } else if (salesVolume <= 500) {
                commission = 0.045;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume <= 1000) {
                commission = 0.075;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume <= 10000) {
                commission = 0.1;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume > 10000) {
                commission = 0.13;
                System.out.printf("%.2f", (salesVolume * commission));
            }
        }else if (city.equals("Plovdiv")) {
            if (salesVolume < 0) {
                System.out.println("error");
            } else if (salesVolume <= 500) {
                commission = 0.055;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume <= 1000) {
                commission = 0.08;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume <= 10000) {
                commission = 0.12;
                System.out.printf("%.2f", (salesVolume * commission));
            } else if (salesVolume > 10000) {
                commission = 0.145;
                System.out.printf("%.2f", (salesVolume * commission));
            }
        }else {
            System.out.println("error");
        }
    }
}
