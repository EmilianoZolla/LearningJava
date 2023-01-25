package basicSyntaxExe;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String typedPassword = scanner.nextLine();
        String password = "";
        for (int i = 1; i <= username.length() ; i++){
            password = password + username.charAt(username.length() - i);
        }

        for (int i = 1; i < 4; i++) {
            if (typedPassword.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                if (i == 3) {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
                typedPassword = scanner.nextLine();
            }
        }
    }
}
