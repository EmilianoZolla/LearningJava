package arraysLab;

import java.util.Scanner;

public class E02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArray = new int [n];

        for (int i =0 ; i < numbersArray.length ; i++) {
            numbersArray[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i <= numbersArray.length-1 ; i++) {
            System.out.print(numbersArray[numbersArray.length-1-i] + " ");
        }
    }
}
