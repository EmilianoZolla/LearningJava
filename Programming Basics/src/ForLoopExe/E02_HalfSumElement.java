package ForLoopExe;

import java.util.Scanner;

public class E02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());
        int maxValue = 0;
        int sum = 0;
        for (int row = 0; row < i; row++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxValue){
                maxValue = number;
            }
            sum = sum+number;
        }
        if (maxValue == sum-maxValue){
            System.out.println("Yes");
            System.out.println("Sum = " + maxValue);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxValue - (sum-maxValue)));
        }
    }
}
