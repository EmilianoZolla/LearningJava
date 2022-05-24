package ForLoopLab;

import java.util.Scanner;

public class E03_Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for ( int start = 1 ; start <= n; start = (start + 3)) {
            System.out.println(start);
        }
    }
}
