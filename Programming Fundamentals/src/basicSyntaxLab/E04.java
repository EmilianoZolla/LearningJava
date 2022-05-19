package basicSyntaxLab;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int minutesToArrival = (hour*60) + minutes + 30;
        if (minutesToArrival / 60 < 24) {
            System.out.printf("%d:%02d", (minutesToArrival / 60), (minutesToArrival % 60));
        } else {
            System.out.printf("%d:%02d", (minutesToArrival / 60 - 24), (minutesToArrival % 60));
        }
    }
}
