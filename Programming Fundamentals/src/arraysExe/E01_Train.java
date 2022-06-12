package arraysExe;

import java.util.Scanner;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[numberOfWagons];
        int totalPeopleOnTrain = 0;
        String[] outputPeople = new String[people.length];
        for (int i = 0; i < numberOfWagons ; i++) {
            people[i] = Integer.parseInt(scanner.nextLine());
            totalPeopleOnTrain = totalPeopleOnTrain + people[i];
            outputPeople[i] = String.valueOf(people[i]);
        }
        System.out.println(String.join(" ",outputPeople));
        System.out.println(totalPeopleOnTrain);
    }
}
