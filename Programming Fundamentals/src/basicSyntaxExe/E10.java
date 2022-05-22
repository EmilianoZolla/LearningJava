package basicSyntaxExe;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double pricePerLightSaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        double moneyNeeded = (studentsCount * pricePerBelt) + (studentsCount * pricePerRobe) + ((Math.ceil(studentsCount*1.1))*pricePerLightSaber);
        int freeBelts = studentsCount / 6;
        double freeBeltsPrice = freeBelts * pricePerBelt;
        double totalMoneyNeeded = moneyNeeded - freeBeltsPrice;
        if (totalMoneyNeeded <= money){
            System.out.printf("The money is enough - it would cost %.2flv.",totalMoneyNeeded);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", (totalMoneyNeeded - money));
        }
    }
}
