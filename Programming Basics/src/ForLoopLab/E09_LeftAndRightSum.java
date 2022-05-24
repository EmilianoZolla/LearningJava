package ForLoopLab;

import java.util.Scanner;

public class E09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;
        for ( int row = 0; row <n; row++){
            number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }
        int sum2 = 0;
        int number2 = 0;
        for ( int row = n; row < n+n; row++){
            number2 = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + number2;
        }
        if (sum == sum2){
            System.out.println("Yes, sum = " + sum);
        } else {
            System.out.println("No, diff = " + Math.abs(sum-sum2));
        }
    }
}