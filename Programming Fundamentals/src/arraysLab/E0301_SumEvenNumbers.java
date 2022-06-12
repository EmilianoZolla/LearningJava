package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class E0301_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i <= numbersArray.length-1 ; i++) {
            if (numbersArray[i] % 2 == 0){
                sum += numbersArray[i];

            }
        }
        System.out.println(sum);
    }

}
