package dataTypesAndVariablesLab;

import java.util.Scanner;

public class E06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lineOne = scanner.nextLine().charAt(0);
        char lineTwo = scanner.nextLine().charAt(0);
        char lineThree = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c",lineOne, lineTwo, lineThree);
    }
}
