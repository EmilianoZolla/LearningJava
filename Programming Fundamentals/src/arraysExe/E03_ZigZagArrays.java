package arraysExe;

import java.util.Scanner;

public class E03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] lineOne = new int[n];
        int [] lineTwo = new int[n];

        for (int i = 1; i <= n ; i++) {
            String numbers = scanner.nextLine();
            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);
            if (i % 2 == 0){
                lineOne [i-1] = secondNumber;
                lineTwo [i-1] = firstNumber;
            } else {
                lineOne [i-1] = firstNumber;
                lineTwo [i-1] = secondNumber;
            }

        }
        for (int number : lineOne) {
            System.out.print(number + " ");
        }

        System.out.println();
        for (int number : lineTwo){
            System.out.print(number + " ");
        }
    }
}
