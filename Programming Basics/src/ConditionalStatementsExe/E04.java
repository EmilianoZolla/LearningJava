package ConditionalStatementsExe;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        double discount = 1.0;
        if (puzzleCount + dollsCount + teddyBearsCount + minionsCount + trucksCount >= 50 ){
            discount = 0.25;
        }
        double totalMoneyEarned = puzzleCount * 2.6 + dollsCount * 3 + teddyBearsCount * 4.1 + minionsCount * 8.2 +
                trucksCount * 2 * 1.0;
        double rentPrice = totalMoneyEarned * 0.1;
        double moneyLeft = totalMoneyEarned * discount - rentPrice;
        if (moneyLeft >= tripPrice ) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }
    }

}
// ⦁	Магазин за детски играчки
//Петя има магазин за детски играчки. Тя получава голяма поръчка, която трябва да изпълни. С парите,
// които ще спечели иска да отиде на екскурзия.
//Цени на играчките:
//⦁	Пъзел - 2.60 лв.
//⦁	Говореща кукла - 3 лв.
//⦁	Плюшено мече - 4.10 лв.
//⦁	Миньон - 8.20 лв.
//⦁	Камионче - 2 лв.
//Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена. От спечелените пари Петя
// трябва да даде 10% за наема на магазина. Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
//Вход
//От конзолата се четат 6 реда:
//⦁	Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
//⦁	Брой пъзели - цяло число в интервала [0… 1000]
//⦁	Брой говорещи кукли - цяло число в интервала [0 … 1000]
//⦁	Брой плюшени мечета - цяло число в интервала [0 … 1000]
//⦁	Брой миньони - цяло число в интервала [0 … 1000]
//⦁	Брой камиончета - цяло число в интервала [0 … 1000]
//Изход
//На конзолата се отпечатва:
//⦁	Ако парите са достатъчни се отпечатва:
//⦁	"Yes! {оставащите пари} lv left."
//⦁	Ако парите НЕ са достатъчни се отпечатва:
//⦁	"Not enough money! {недостигащите пари} lv needed."
//
//Резултатът трябва да се форматира до втория знак след десетичната запетая.