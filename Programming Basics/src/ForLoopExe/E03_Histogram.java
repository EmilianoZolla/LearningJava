package ForLoopExe;

import java.util.Scanner;

public class E03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1count = 0.0;
        double p2count = 0.0;
        double p3count = 0.0;
        double p4count = 0.0;
        double p5count = 0.0;
        for ( int row = 1; row <= n; row++){
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < 200) {
                p1count = p1count + 1;
            } else if (currentNumber < 400){
                p2count = p2count + 1;
            } else if (currentNumber < 600) {
                p3count = p3count + 1;
            } else if (currentNumber < 800) {
                p4count = p4count + 1;
            } else {
                p5count = p5count + 1;
            }
        }
        double p1percent = (p1count / n ) * 100;
        double p2percent = (p2count / n ) * 100;
        double p3percent = (p3count / n ) * 100;
        double p4percent = (p4count / n ) * 100;
        double p5percent = (p5count / n ) * 100;
        System.out.printf("%.2f%% %n", p1percent);
        System.out.printf("%.2f%% %n", p2percent);
        System.out.printf("%.2f%% %n", p3percent);
        System.out.printf("%.2f%% %n", p4percent);
        System.out.printf("%.2f%% %n", p5percent);
    }
}
