package ForLoopExe;

import java.util.Scanner;

public class E07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());


        double musala = 0.0;
        double montBlan = 0.0;
        double kilimandjaro = 0.0;
        double k2 = 0.0;
        double everest = 0.0;

        int totalPeople = 0;

        for ( int i = 1; i <= groups; i++){
            int people = Integer.parseInt(scanner.nextLine());
            totalPeople = totalPeople + people;
            if (people <= 5){
                musala = musala + people;
            }else if ( people <= 12){
                montBlan = montBlan + people;
            }else if (people <= 25){
                kilimandjaro = kilimandjaro + people;
            } else if (people <= 40) {
                k2 = k2 + people;
            } else if (people >= 41){
                everest = everest + people;
            }
        }
        System.out.printf("%.2f%%%n", (musala / totalPeople * 100));
        System.out.printf("%.2f%%%n", (montBlan / totalPeople * 100));
        System.out.printf("%.2f%%%n", (kilimandjaro / totalPeople *100));
        System.out.printf("%.2f%%%n", (k2 / totalPeople * 100));
        System.out.printf("%.2f%%%n", (everest / totalPeople * 100));
    }
}
