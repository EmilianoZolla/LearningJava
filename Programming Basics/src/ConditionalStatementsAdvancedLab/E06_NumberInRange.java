package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= ( -100 ) && number != 0 && number <= 100 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
