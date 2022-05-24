package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        switch (type){
            case "Premiere":
                System.out.printf("%.2f leva", ( 12 * r * c ));
                break;
            case "Normal":
                System.out.printf("%.2f leva", (7.5 * r * c));
                break;
            case "Discount":
                System.out.printf("%.2f leva", 5 * r * c);
        }
    }
}
