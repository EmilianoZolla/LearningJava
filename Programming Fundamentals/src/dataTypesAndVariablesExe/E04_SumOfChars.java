package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < lines ; i++) {
            char input = scanner.nextLine().charAt(0);
            sum = sum + input;
        }
        System.out.printf("The sum equals: %d",sum);
    }

}
