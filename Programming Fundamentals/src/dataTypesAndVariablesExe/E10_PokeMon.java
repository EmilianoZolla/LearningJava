package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int currentN =n;
        int pokeCounter = 0;

        while(currentN >= m){
            if ( currentN == n * 0.5 && y != 0 && currentN / y >= 0 && y!=1){
                currentN = currentN / y;
            } else {
                currentN = currentN - m;
                pokeCounter++;
            }
        }


        System.out.println(currentN);
        System.out.println(pokeCounter);
    }
}