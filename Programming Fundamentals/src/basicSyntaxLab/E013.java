package basicSyntaxLab;

import java.util.Scanner;

public class E013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = (2 * i + 1);
            System.out.println(number);
            sum = sum + number;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
