package basicSyntaxLab;

import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; number % 2 != 0 ; i++) {
            System.out.printf("Please write an even number.%n");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", Math.abs(number));
    }
}
