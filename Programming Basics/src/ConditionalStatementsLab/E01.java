package ConditionalStatementsLab;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        }
    }
}
// Напише конзолна програма, която чете оценка (цяло число), въведена от потребителя и отпечатва "Excellent!"
// ако оценката е 5 или по-висока.