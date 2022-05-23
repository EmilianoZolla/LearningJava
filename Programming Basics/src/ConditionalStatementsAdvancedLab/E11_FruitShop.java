package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double banana = 0.0;
        double apple = 0.0;
        double orange = 0.0;
        double grapefruit = 0.0;
        double kiwi = 0.0;
        double pineapple = 0.0;
        double grapes = 0.0;

        if (weekDay.equals("Monday") || weekDay.equals("Tuesday") || weekDay.equals("Wednesday") || weekDay.equals("Thursday")
                || weekDay.equals("Friday")){
            banana = 2.50;
            apple = 1.20;
            orange = 0.85;
            grapefruit = 1.45;
            kiwi = 2.70;
            pineapple = 5.50;
            grapes = 3.85;
            if (fruit.equals("banana")){
                System.out.printf (" %.2f", (banana * quantity));
            } else if (fruit.equals("apple")) {
                System.out.printf ("%.2f", (apple * quantity));
            } else if (fruit.equals("orange")){
                System.out.printf ("%.2f", (orange * quantity));
            } else if (fruit.equals("grapefruit")){
                System.out.printf ("%.2f", (grapefruit * quantity));
            } else if (fruit.equals("kiwi")){
                System.out.printf ("%.2f", (kiwi *quantity));
            } else if (fruit.equals("pineapple")){
                System.out.printf ("%.2f",(pineapple * quantity));
            } else if (fruit.equals("grapes")){
                System.out.printf ("%.2f", (grapes * quantity));
            } else {
                System.out.println("error");
            }

        } else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")){
            banana = 2.70;
            apple = 1.25;
            orange = 0.90;
            grapefruit = 1.60;
            kiwi = 3.0;
            pineapple = 5.60;
            grapes = 4.20;
            if (fruit.equals("banana")){
                System.out.printf (" %.2f", (banana * quantity));
            } else if (fruit.equals("apple")) {
                System.out.printf ("%.2f", (apple * quantity));
            } else if (fruit.equals("orange")){
                System.out.printf ("%.2f", (orange * quantity));
            } else if (fruit.equals("grapefruit")){
                System.out.printf ("%.2f", (grapefruit * quantity));
            } else if (fruit.equals("kiwi")){
                System.out.printf ("%.2f", (kiwi *quantity));
            } else if (fruit.equals("pineapple")){
                System.out.printf ("%.2f",(pineapple * quantity));
            } else if (fruit.equals("grapes")){
                System.out.printf ("%.2f", (grapes * quantity));
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

    }
}
