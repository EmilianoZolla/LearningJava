package ForLoopExe;

import java.util.Scanner;

public class E08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournirsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int totalWins = 0;

        for (int i = 1; i <= tournirsCount; i++) {
            String stage = scanner.nextLine();
            if (stage.equals("W")) {
                points = points + 2000;
                totalWins++;
            } else if (stage.equals("F")) {
                points = points + 1200;
            } else if (stage.equals("SF")) {
                points = points + 720;
            }
        }
        int totalPoints = startingPoints + points;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", (points / tournirsCount));
        System.out.printf("%.2f%%", ((totalWins * 1.0 / tournirsCount) * 100));

    }
}
