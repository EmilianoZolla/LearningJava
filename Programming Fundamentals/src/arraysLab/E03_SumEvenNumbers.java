package arraysLab;

import java.util.Scanner;

public class E03_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] inputArray = input.split(" ");
        int [] numbers = new int [inputArray.length];
        for (int i = 0; i <= inputArray.length-1 ; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        int sum = 0;
        for (int i = 0; i <= numbers.length-1 ; i++) {
            if (numbers[i] % 2 == 0){
                sum += numbers[i];

            }
        }
        System.out.println(sum);
    }
}
