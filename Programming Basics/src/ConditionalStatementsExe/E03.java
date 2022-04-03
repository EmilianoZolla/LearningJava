package ConditionalStatementsExe;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHours = Integer.parseInt(scanner.nextLine());
        int initialMinutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = (initialHours * 60) + initialMinutes + 15;
        int endHours = totalMinutes / 60;
        int endMinutes = totalMinutes % 60;

        if (endHours > 23) {
            endHours = 0;
        }
        System.out.printf("%d:%02d", endHours, endMinutes);

    }
}

// Да се напише програма, която чете час и минути от 24-часово денонощие, въведени от потребителя и изчислява колко ще е
// часът след 15 минути. Резултатът да се отпечата във формат часове:минути. Часовете винаги са между 0 и 23, а минутите
// винаги са между 0 и 59. Часовете се изписват с една или две цифри. Минутите се изписват винаги с по две цифри,
// с водеща нула, когато е необходимо.