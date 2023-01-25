package basicSyntaxLab;

import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum =0;
        for (int i = 0; i <= n ; i++) {
            if (i % 2 != 0){
                System.out.println(i);
                sum = sum+i;
                n++;
            }

        }
        System.out.printf("Sum: %d",sum);
    }
}
 