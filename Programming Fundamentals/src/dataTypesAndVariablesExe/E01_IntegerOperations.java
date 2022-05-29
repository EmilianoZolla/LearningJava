package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int divideBy = Integer.parseInt(scanner.nextLine());
        int multiplyBy = Integer.parseInt(scanner.nextLine());

        int total = (((firstNumber+secondNumber) / divideBy) * multiplyBy);
        System.out.println(total);
    }
}
