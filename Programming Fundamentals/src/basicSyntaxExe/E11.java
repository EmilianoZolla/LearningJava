package basicSyntaxExe;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double rageCosts = 0.0;
        int keyboardCounter = 0;
        for (int i = 1; i <= lostGamesCount ; i++) {

            if (i % 2 == 0) {
                rageCosts = rageCosts + headsetPrice;
            }
            if (i % 3 == 0 ) {
                rageCosts= rageCosts + mousePrice;
            }
            if (i % 3 == 0 && i % 2 == 0 ){
                rageCosts = rageCosts + keyboardPrice;
                keyboardCounter = keyboardCounter + 1;
                if (keyboardCounter % 2 == 0  ){
                    rageCosts = rageCosts + displayPrice;
                }
                }

        }
        System.out.printf("Rage expenses: %.2f lv.",rageCosts);
    }

}
