package ForLoopExe;

import java.util.Scanner;

public class E06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int gradersCount = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;
        for (int row = 1; row <= gradersCount; row++){
            String nameOfGrader = scanner.nextLine();
            double pointsGiven = Double.parseDouble(scanner.nextLine());
            double currentPoints = (nameOfGrader.length() * pointsGiven) / 2;
            totalPoints = totalPoints + currentPoints;
            if (totalPoints >= 1250.5) {
                break;
            }
        }
        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,totalPoints);
        } else {

            System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - totalPoints));
        }
    }
}
