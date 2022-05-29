package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E05_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoint = Integer.parseInt(scanner.nextLine());
        int endingPoint = Integer.parseInt(scanner.nextLine());
        char currentSymbol = (char) startingPoint;
        for (int i = startingPoint; i <=endingPoint ; i++) {
            System.out.printf("%c ",currentSymbol);
            currentSymbol++;
        }
    }
}
