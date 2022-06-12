package arraysExe;

import java.util.Scanner;

public class E02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] lineOne = scanner.nextLine().split(" ");
        String [] lineTwo = scanner.nextLine().split(" ");

        for( String secondElement : lineTwo){
            for (String firstElement : lineOne){
                if (firstElement.equals(secondElement)){
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
