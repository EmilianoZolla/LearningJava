package ForLoopLab;

import java.util.Scanner;

public class E05_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        for ( int letter = 0; letter < string.length(); letter = letter + 1) {
            System.out.println(string.charAt(letter));
        }
    }
}
