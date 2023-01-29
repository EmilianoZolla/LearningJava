package basicSyntaxMoreExe;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int max = Math.max(firstNumber, Math.max(secondNumber,thirdNumber));
        int min = Math.min(firstNumber, Math.min(secondNumber,thirdNumber));


        int middlePosition = min;
        if (firstNumber < max && firstNumber > min ){
            middlePosition = firstNumber;
        } else if (secondNumber < max && secondNumber > min) {
            middlePosition = secondNumber;
        } else if (thirdNumber < max && thirdNumber > min) {
            middlePosition = thirdNumber;
        }
        System.out.printf("%d%n%d%n%d", max,middlePosition,min);
    }
}
