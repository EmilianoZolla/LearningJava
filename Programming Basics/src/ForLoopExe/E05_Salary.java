package ForLoopExe;

import java.util.Scanner;

public class E05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < tabs; row++){
            String site = scanner.nextLine();
            switch (site){
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary = salary - 100;
                    break;
                case "Reddit":
                    salary = salary - 50;
                    break;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }else {
            System.out.println(salary);
        }
    }
}

