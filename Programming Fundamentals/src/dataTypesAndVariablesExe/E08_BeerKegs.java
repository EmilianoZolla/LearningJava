package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());
        String winningKeg ="";
        var volume = 0.0;
        for (int i = 0; i < kegsCount ; i++) {
            String kegModel = scanner.nextLine();
            float radiusOfKeg = Float.parseFloat(scanner.nextLine());
            int heightOfKeg = Integer.parseInt(scanner.nextLine());
            var currentKegVolume = Math.PI * radiusOfKeg * radiusOfKeg * heightOfKeg;
            if (volume < currentKegVolume){
                volume = currentKegVolume;
                winningKeg = kegModel;
            }
        }
        System.out.println(winningKeg);

    }
}
