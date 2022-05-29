package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int dayCounter = 0;
        int currentYield = startingYield;
        int totalYield = 0;
        while ( currentYield >= 100) {
            totalYield = totalYield + currentYield;
            if (totalYield >= 26) {
                totalYield = totalYield - 26;
            } else {
                totalYield = 0;
            }
            currentYield = currentYield - 10;
            dayCounter++;
        }
        System.out.println(dayCounter);
        if (totalYield >= 26){
            totalYield = totalYield - 26;
            System.out.println(totalYield);
        } else {
            System.out.println(0);
        }
    }
}