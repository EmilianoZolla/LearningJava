package basicSyntaxExe;

import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String numberString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numberString.length() ; i++) {
            char currentDigit = numberString.charAt(i);
            int currentDigitConverted = Integer.parseInt(String.valueOf(currentDigit));
            int currentSum = 1;
            for (int k = currentDigitConverted; k > 0 ; k--) {
                currentSum = k * currentSum;
            }
            sum += currentSum;
        }
        if (sum == number){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}