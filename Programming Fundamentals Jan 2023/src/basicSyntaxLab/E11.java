package basicSyntaxLab;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startingNumber = Integer.parseInt(scanner.nextLine());

        if (startingNumber > 10) {
            int result = number * startingNumber;
            System.out.printf("%d X %d = %d", number, startingNumber, result);
        }else{
            for (int i = startingNumber; i <=10 ; i++) {
                int result = number * i;
                System.out.printf("%d X %d = %d%n", number, i, result);
            }

        }
    }
}
