package arraysLab;

import java.util.Scanner;

public class E04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] inputArray = input.split(" ");
        String [] outputArray = new String[inputArray.length];
        for (int i = 0; i < inputArray.length ; i++) {
            outputArray[i] = inputArray [inputArray.length-1-i];
            System.out.print(outputArray[i] + " ");
        }
    }
}
