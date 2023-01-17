package basixSyntaxLab;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hour * 60 ) + minutes + 30;
        int afterHour = totalMinutes / 60;
        int afterMinutes = totalMinutes % 60;

        if (afterHour > 23) {
            afterHour = 0;
        }
        System.out.printf("%d:%02d",afterHour,afterMinutes);

    }
}
