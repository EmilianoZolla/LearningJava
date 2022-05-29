package dataTypesAndVariables;

import java.util.Scanner;

public class E08_LowerOrUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.nextLine().charAt(0);

        if (inputChar >= 'a' && inputChar <= 'z'){
            System.out.println("lower-case");
        } else if ( inputChar >= 'A' && inputChar <= 'Z'){
            System.out.println("upper-case");
        }
    }
}
