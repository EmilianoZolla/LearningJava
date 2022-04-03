package ConditionalStatementsExe;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0.0;
        int even = 0;
        int endsInFive = 0;
        if(number <= 100){
            bonusPoints = 5;
        } else if (number <= 1000) {
            bonusPoints = number * 0.2;
        } else {
            bonusPoints = number * 0.1;
        }

        if (number % 2 == 0) {
            even = 1;
        }
        if (number % 10 == 5) {
            endsInFive = 2;
        }
        System.out.println(bonusPoints + even + endsInFive);
        System.out.println(number + bonusPoints + even + endsInFive);
    }
}
// ⦁	Бонус точки
//Дадено е цяло число – начален брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу.
// Да се напише програма, която пресмята бонус точките, които получава числото и общия брой точки (числото + бонуса).
//⦁	Ако числото е до 100 включително, бонус точките са 5.
//⦁	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
//⦁	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
//
//⦁	Допълнителни бонус точки (начисляват се отделно от предходните):
//⦁	За четно число  + 1 т.
//⦁	За число, което завършва на 5  + 2 т.