package basicSyntaxExe;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashed = 0;
        int mouseTrashed = 0;
        int keyboardTrashed = 0;
        int displayTrashed = 0;
        for (int gameLostCounter = 1; gameLostCounter <= gamesLost; gameLostCounter++) {
            if (gameLostCounter % 2 == 0) {
                headsetTrashed++;
            }
            if (gameLostCounter % 3 == 0){
                mouseTrashed++;
            }
            if (gameLostCounter % 6 == 0){
                keyboardTrashed++;
                if (keyboardTrashed % 2 == 0){
                    displayTrashed++;
                }

            }
        }
        double totalExpenses = (headsetPrice * headsetTrashed) + (mousePrice * mouseTrashed) + (keyboardPrice * keyboardTrashed) + (displayPrice * displayTrashed);
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
