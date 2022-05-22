package basicSyntaxExe;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nOrders = Integer.parseInt(scanner.nextLine());
        double currentPrice = 0.0;
        double totalPrice = 0.0;
        for (int i = 1; i <=nOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            currentPrice = ((daysInMonth*capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n",currentPrice);
            totalPrice=totalPrice + currentPrice;
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }

}
