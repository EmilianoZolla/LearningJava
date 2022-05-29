package dataTypesAndVariablesExe;

import java.util.Scanner;

public class E03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;

        if (capacity >= numberOfPeople){
            courses = 1;
        } else {
            if (numberOfPeople % capacity > 0){
                courses = (numberOfPeople / capacity) + 1;
            } else {
                courses = numberOfPeople / capacity;
            }
        }
        System.out.println(courses);
    }
}
