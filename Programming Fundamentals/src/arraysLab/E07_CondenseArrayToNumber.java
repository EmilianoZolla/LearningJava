package arraysLab;

import java.util.Scanner;

public class E07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputString = input.split(" ");
        int[] integerArray = new int[inputString.length];
        for (int i = 0; i < inputString.length ; i++) {
            integerArray[i] = Integer.parseInt(inputString[i]);
        }
        while (integerArray.length > 1){
            int[] consensedArray = new int[integerArray.length-1];
            for (int i = 0; i < integerArray.length-1; i++) {
                consensedArray[i] = integerArray[i] + integerArray[i +1];
            }
            integerArray = consensedArray;
        }
        System.out.println(integerArray[0]);
    }
}
