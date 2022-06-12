package arraysLab;

import java.util.Scanner;

public class E05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] inputArray = input.split(" ");
        int [] inputNumbersArray = new int[inputArray.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < inputArray.length ; i++) {
            inputNumbersArray[i] = Integer.parseInt(inputArray[i]);
            if (inputNumbersArray[i] % 2 == 0){
                sumEven = sumEven + inputNumbersArray[i];
            } else {
                sumOdd = sumOdd + inputNumbersArray[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
