package ForLoopLab;

import java.util.Scanner;

public class E07_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;

        for ( int repetitions = 1; repetitions <= n; repetitions++ ) {
            int number = Integer.parseInt(scanner.nextLine());
            total = total + number;
        }
        System.out.println(total);
    }
}
