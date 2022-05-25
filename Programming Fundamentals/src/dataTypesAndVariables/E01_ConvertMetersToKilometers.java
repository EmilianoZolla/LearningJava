package dataTypesAndVariables;

import java.util.Scanner;

public class E01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kiloMeters = meters / 1000.0;
        System.out.printf("%.2f",kiloMeters);
    }
}
