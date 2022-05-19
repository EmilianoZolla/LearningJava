package basicSyntaxLab;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;
        if (age >= 0 && age <= 18) {
            switch (dayOfWeek) {
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 5;
                    break;
            }
            System.out.printf("%d$", ticketPrice);
        } else if (age > 18 && age <= 64) {
            switch (dayOfWeek) {
                case "Weekday":
                    ticketPrice = 18;
                    break;
                case "Weekend":
                    ticketPrice = 20;
                    break;
                case "Holiday":
                    ticketPrice = 12;
                    break;
            }
            System.out.printf("%d$", ticketPrice);
        } else if (age > 64 && age <= 122) {
            switch (dayOfWeek) {
                case "Weekday":
                    ticketPrice = 12;
                    break;
                case "Weekend":
                    ticketPrice = 15;
                    break;
                case "Holiday":
                    ticketPrice = 10;
                    break;
            }
            System.out.printf("%d$", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
