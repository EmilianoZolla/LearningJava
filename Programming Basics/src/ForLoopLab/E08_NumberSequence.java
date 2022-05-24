package ForLoopLab;

import java.util.Scanner;

public class E08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int row = 1; row <= n; row++){
            int value = Integer.parseInt(scanner.nextLine());
            if (value > max){
                max = value;
            }
            if (value < min){
                min = value;
            }
        }

        System.out.println("Max number: " + max );
        System.out.println("Min number: " + min );
    }
}
