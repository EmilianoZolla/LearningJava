package FirstStepsInCodingExe;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentBookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysPerBook = Integer.parseInt(scanner.nextLine());

        double hoursNeededTotal = 1.0 * currentBookPages / pagesPerHour;
        double hoursNeededDaily = hoursNeededTotal / daysPerBook;
        System.out.printf("%.0f", hoursNeededDaily);

    }
}
// ⦁	Задължителна литература
//За лятната ваканция в списъка със задължителна литература на Жоро има определен брой книги. Понеже Жоро предпочита
// да играе с приятели навън, вашата задача е да му помогнете да изчисли колко часа на ден трябва да отделя,
// за да прочете необходимата литература.
//Вход
//От конзолата се четат 3 реда:
//⦁	Брой страници в текущата книга – цяло число в интервала [1…1000]
//⦁	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
//⦁	Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
//Изход
//Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.