package basicSyntaxMoreExe;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSymbols = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 1; i <= numberOfSymbols ; i++) {
            int currentSymbol = Integer.parseInt(scanner.nextLine());
            String currentSymbolString = String.valueOf(currentSymbol);
            if (currentSymbolString.charAt(0) == '2'){
                if (currentSymbolString.length() == 1){
                    result = result + "a";
                }else if (currentSymbolString.length() == 2){
                    result = result + "b";
                }else if (currentSymbolString.length() == 3){
                    result = result + "c";
                }

            }else if(currentSymbolString.charAt(0) == '3'){
                if (currentSymbolString.length() == 1){
                    result = result + "d";
                }else if (currentSymbolString.length() == 2){
                    result = result + "e";
                }else if (currentSymbolString.length() == 3){
                    result = result + "f";
                }

            }else if (currentSymbolString.charAt(0) == '4'){
                if (currentSymbolString.length() == 1){
                    result = result + "g";
                }else if (currentSymbolString.length() == 2){
                    result = result + "h";
                }else if (currentSymbolString.length() == 3){
                    result = result + "i";
                }
            }else if (currentSymbolString.charAt(0) =='5'){
                if (currentSymbolString.length() == 1){
                    result = result + "j";
                }else if (currentSymbolString.length() == 2){
                    result = result + "k";
                }else if (currentSymbolString.length() == 3){
                    result = result + "l";
                }

            }else if (currentSymbolString.charAt(0) == '6'){
                if (currentSymbolString.length() == 1){
                    result = result + "m";
                }else if (currentSymbolString.length() == 2){
                    result = result + "n";
                }else if (currentSymbolString.length() == 3){
                    result = result + "o";
                }
            }else if (currentSymbolString.charAt(0) == '7'){
                if (currentSymbolString.length() == 1){
                    result = result + "p";
                }else if (currentSymbolString.length() == 2){
                    result = result + "q";
                }else if (currentSymbolString.length() == 3){
                    result = result + "r";
                }else if (currentSymbolString.length() == 4){
                    result = result + "s";
                }

            }else if (currentSymbolString.charAt(0) == '8'){
                if (currentSymbolString.length() == 1){
                    result = result + "t";
                }else if (currentSymbolString.length() == 2){
                    result = result + "u";
                }else if (currentSymbolString.length() == 3){
                    result = result + "v";
                }

            }else if (currentSymbolString.charAt(0) == '9'){
                if (currentSymbolString.length() == 1){
                    result = result + "w";
                }else if (currentSymbolString.length() == 2){
                    result = result + "x";
                }else if (currentSymbolString.length() == 3){
                    result = result + "y";
                }else if (currentSymbolString.length() == 4){
                    result = result + "z";
                }

            }else if (currentSymbolString.charAt(0) == '0') {
                    result = result + " ";
            }
        }
        System.out.println(result);
    }
}
