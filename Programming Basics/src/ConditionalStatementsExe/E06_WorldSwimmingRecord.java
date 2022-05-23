package ConditionalStatementsExe;

import java.util.Scanner;

public class E06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double ivansSpeed = Double.parseDouble(scanner.nextLine());

        double ivansTime =  distance * ivansSpeed;
        double ivansDelay = Math.floor( distance / 15 ) * 12.5;
        double ivansActualTime = ivansTime + ivansDelay;

        if (ivansActualTime < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is " + "%.2f" + " seconds.", ivansActualTime);
        }
        else {
            double ivansNeededSeconds = ivansActualTime - currentRecord;
            System.out.printf("No, he failed! He was " + "%.2f" + " seconds slower.", ivansNeededSeconds);
        }
    }

}