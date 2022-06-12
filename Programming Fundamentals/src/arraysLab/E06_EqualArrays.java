package arraysLab;

import java.util.Scanner;

public class E06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLineOne = scanner.nextLine();
        String inputLineTwo = scanner.nextLine();

        String [] arrayOne = inputLineOne.split(" ");
        String [] arrayTwo = inputLineTwo.split(" ");

        int [] integerArrayOne = new int[arrayOne.length];
        int [] integerArrayTwo = new int[arrayTwo.length];
        for (int i = 0; i <arrayOne.length ; i++) {
            integerArrayOne[i] = Integer.parseInt(arrayOne[i]);
        }
        for (int i = 0; i <arrayTwo.length ; i++) {
            integerArrayTwo[i] = Integer.parseInt(arrayTwo[i]);
        }
        int sum = 0;
        int identical = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (integerArrayOne[i] == integerArrayTwo[i]) {
                sum = sum + integerArrayOne[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                identical = 1;
                break;
            }
        }
        if (identical == 0){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
