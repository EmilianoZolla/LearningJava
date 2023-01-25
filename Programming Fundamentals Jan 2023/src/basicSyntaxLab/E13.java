package basicSyntaxLab;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = 2 * i + 1;
            System.out.println(currentNumber);
            sum += currentNumber;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
