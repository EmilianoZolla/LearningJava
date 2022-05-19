package basicSyntaxLab;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mainNumber = Integer.parseInt(scanner.nextLine());
        int startNumber = Integer.parseInt(scanner.nextLine());

        if (startNumber > 10) {
            System.out.printf("%d X %d = %d", mainNumber, startNumber, (mainNumber*startNumber));
        } else {
            for (int i = startNumber ; i <= 10 ; i++) {
                System.out.printf("%d X %d = %d%n", mainNumber, i, (mainNumber*i));
            }
        }
    }
}
