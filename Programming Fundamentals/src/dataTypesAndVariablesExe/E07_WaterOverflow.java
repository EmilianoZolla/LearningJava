package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int littersAccumulated = 0;
        for (int i = 0; i < numberOfLines ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (capacity - littersAccumulated - input >= 0){
                littersAccumulated = littersAccumulated + input;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(littersAccumulated);
    }
}
