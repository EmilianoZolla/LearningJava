package ConditionalStatementsAdvancedExe;

import java.util.Scanner;

public class E08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int examTime = hourExam * 60 + minutesExam;
        int arrivalTime = hourArrival * 60 + minutesArrival;
        int timeDifference = Math.abs(examTime - arrivalTime);

        if ( examTime < arrivalTime ){
            System.out.println("Late");
            if (timeDifference >= 60 ) {
                int hour = timeDifference / 60;
                int minutes = timeDifference % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d minutes after the start", timeDifference);
            }
        } else if (examTime >= arrivalTime && examTime - arrivalTime <= 30) {
            System.out.println(("On time"));
            if (timeDifference != 0){
                System.out.printf("%d minutes before the start", timeDifference);
            }
        } else {
            System.out.println("Early");
            if  (timeDifference >= 60) {
                int hour = timeDifference / 60;
                int minutes = timeDifference % 60;
                System.out.printf("%d:%02d hours before the start", hour,minutes);
            } else {
                System.out.printf("%d minutes before the start", timeDifference);
            }
        }

    }
}
