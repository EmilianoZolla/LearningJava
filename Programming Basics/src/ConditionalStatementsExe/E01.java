package ConditionalStatementsExe;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeOneInSeconds = Integer.parseInt(scanner.nextLine());
        int timeTwoInSeconds = Integer.parseInt(scanner.nextLine());
        int timeThreeInSeconds = Integer.parseInt(scanner.nextLine());

        int totalTimeInSeconds = timeOneInSeconds + timeTwoInSeconds + timeThreeInSeconds;
        int minutes = totalTimeInSeconds / 60;
        int seconds = totalTimeInSeconds % 60;
        if (seconds < 10 ) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
// ⦁	Сумиране на секунди
//Трима спортни състезатели финишират за някакъв брой секунди (между 1 и 50).
// Да се напише програма, която чете времената на състезателите в секунди, въведени от потребителя и пресмята сумарното
// им време във формат "минути:секунди". Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").