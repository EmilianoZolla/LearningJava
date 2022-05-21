package basicSyntaxExe;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int workingNumber = number;
        int lastDigit = 0;
        int sum = 1;
        int totalSum = 0;
        while(workingNumber>0){
            lastDigit = workingNumber % 10;
            for (int i = 1; i <= lastDigit ; i++) {
                sum = sum * i;
            }
            workingNumber = workingNumber / 10;
            totalSum = totalSum + sum;
            sum = 1;

        }
        if (totalSum == number){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
