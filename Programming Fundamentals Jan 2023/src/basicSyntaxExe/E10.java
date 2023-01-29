package basicSyntaxExe;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice= Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double totalPriceOfEquipment = ( ( Math.ceil(1.1 * studentCount) * lightSaberPrice) ) + (studentCount * robesPrice) + (((studentCount - (studentCount / 6)) * beltsPrice));

        if (totalPriceOfEquipment <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPriceOfEquipment);
        } else {
            double moneyNeeded = (totalPriceOfEquipment - amountOfMoney);
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(moneyNeeded));
        }
    }
}
