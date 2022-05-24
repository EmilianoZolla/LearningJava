package ForLoopLab;

import java.util.Scanner;

public class E10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for ( int row = 0; row < n; row++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (row % 2 == 0) {
                sumEven = sumEven + number;
            }else{
                sumOdd = sumOdd + number;
            }
        }
        if (sumEven == sumOdd){
            System.out.println("Yes");
            System.out.println("Sum = " + (sumEven));
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
