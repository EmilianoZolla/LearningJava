package ConditionalStatementsExe;

import java.util.Scanner;

public class E08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int seriesLenght = Integer.parseInt(scanner.nextLine());
        int lunchBreakLenght = Integer.parseInt(scanner.nextLine());
        double timeForLunch = lunchBreakLenght / 8.0;
        double timeForRest = lunchBreakLenght / 4.0;
        double timeLeft = lunchBreakLenght - timeForLunch - timeForRest;


        if ( timeLeft >= seriesLenght ) {
            double freeTime = Math.abs (timeLeft - seriesLenght);
            System.out.printf("You have enough time to watch " + series + " and left with %.0f minutes free time.", Math.ceil(freeTime));

        } else {
            double insufficientTime = Math.abs(seriesLenght - timeLeft);
            System.out.printf("You don't have enough time to watch " + series + ", you need %.0f more minutes.", Math.ceil(insufficientTime));
        }
    }
}

