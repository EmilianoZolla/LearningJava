package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; input > 0 ; i++) {
            int currentNumber = input % 10;
            sum = sum + currentNumber;
            input = input / 10;
        }
        System.out.println(sum);
    }
}
