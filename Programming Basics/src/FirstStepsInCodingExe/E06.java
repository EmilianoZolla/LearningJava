package FirstStepsInCodingExe;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double totalMaterialsCost = (nylon + 2) * 1.5 + (paint + (paint*0.1)) * 14.5 + thinner * 5.0 + 0.40;
        double workHoursCosts = workHours * (totalMaterialsCost * 0.3);

        double totalCosts = totalMaterialsCost + workHoursCosts;

        System.out.println(totalCosts);


    }
}
// ⦁	Пребоядисване
//Румен иска да пребоядиса хола и за целта е наел майстори. Напишете програма, която изчислява разходите за ремонта,
// предвид следните цени:
//⦁	Предпазен найлон - 1.50 лв. за кв. метър
//⦁	Боя - 14.50 лв. за литър
//⦁	Разредител за боя - 5.00 лв. за литър
//За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството боя и 2 кв.м. найлон,
// разбира се и 0.40 лв. за торбички. Сумата, която се заплаща на майсторите за 1 час работа, е равна на 30% от сбора
// на всички разходи за материали.
//Вход
//Входът се чете от конзолата и съдържа точно 4 реда:
//⦁	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
//⦁	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
//⦁	Количество разредител (в литри) - цяло число в интервала [1…30]
//⦁	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
//Изход
//Да се отпечата на конзолата един ред:
//⦁	"{сумата на всички разходи}"