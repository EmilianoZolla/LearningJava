package arraysLab;

import java.util.Scanner;

public class E01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayArray = new String[7];
        dayArray[0] = "Monday";
        dayArray[1] = "Tuesday";
        dayArray[2] = "Wednesday";
        dayArray[3] = "Thursday";
        dayArray[4] = "Friday";
        dayArray[5] = "Saturday";
        dayArray[6] = "Sunday";
        int inputDay = Integer.parseInt(scanner.nextLine());
        if (inputDay >= 1 && inputDay <= 7){
            System.out.println(dayArray[inputDay-1]);
        } else{
            System.out.println("Invalid day!");
        }
    }
}
