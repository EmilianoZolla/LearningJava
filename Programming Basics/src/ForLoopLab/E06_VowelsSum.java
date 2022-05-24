package ForLoopLab;

import java.util.Scanner;

public class E06_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int total = 0;
        for (int characterPlace = 0; characterPlace < text.length(); characterPlace++ ) {
            if (text.charAt(characterPlace) == 'a') {
                total = total + 1;
            } else if (text.charAt(characterPlace) == 'e'){
                total = total + 2;
            } else if (text.charAt(characterPlace) == 'i'){
                total = total + 3;
            } else if (text.charAt(characterPlace) == 'o'){
                total = total + 4;
            } else if (text.charAt(characterPlace) == 'u'){
                total = total + 5;
            }
        }
        System.out.println(total);
    }
}
