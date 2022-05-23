package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class E07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        boolean workingDay = true;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                break;
            case "Sunday":
                workingDay = false;
                break;
        }
        if (hour >= 10 && hour <= 18 && workingDay) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }


    }
}
