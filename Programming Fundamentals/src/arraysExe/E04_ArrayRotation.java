package arraysExe;

import java.util.Arrays;
import java.util.Scanner;

public class E04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] inputArray = input.split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String firstElement = inputArray [0];
            for (int j = 0; j > 0 ; j--) {
                inputArray [j] = inputArray [j-1];
            }
            inputArray [inputArray.length-1] = firstElement;
        }
        System.out.print(Arrays.toString(inputArray));
    }
}
