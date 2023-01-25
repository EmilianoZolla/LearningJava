package basicSyntaxExe;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = firstNumber; i <= lastNumber ; i++) {
            System.out.printf("%d ",i);
            sum = sum + i;
        }
        System.out.printf("%nSum: %d", sum);

    }

}
