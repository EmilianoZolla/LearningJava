package FirstStepsInCodingExe;
import java.util.Scanner;
public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositedSum = Double.parseDouble(scanner.nextLine());
        int leghtOfDepositInMonths = Integer.parseInt(scanner.nextLine());
        double interestRates = Double.parseDouble(scanner.nextLine());

        double result = depositedSum + leghtOfDepositInMonths * ((depositedSum * interestRates * 0.01)/12);

        System.out.println(result);
    }
}
// Напишете програма, която изчислява каква сума ще получите в края на депозитния период при определен лихвен процент.
// Използвайте следната формула:
//сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
// Вход
//От конзолата се четат 3 реда:
//⦁	Депозирана сума – реално число в интервала [100.00 … 10000.00]
//⦁	Срок на депозита (в месеци) – цяло число в интервала [1…12]
//⦁	Годишен лихвен процент – реално число в интервала [0.00 …100.00]
//Изход
//Да се отпечата на конзолата сумата в края на срока.