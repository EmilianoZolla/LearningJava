package basicSyntaxExe;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";
        String inputPassword = scanner.nextLine();
        int counter = 0;
        for (int i = userName.length()-1; i >= 0; i--) {
            password = password+(userName.charAt(i));
        }
        while (counter <= 4) {
            if (password.equals(inputPassword)) {
                System.out.printf("User %s logged in.", userName);
                break;
            } else{
                counter++;
                if (counter == 4){
                    System.out.printf("User %s blocked!",userName);
                    break;
                }else {
                    System.out.println("Incorrect password. Try again.");
                    inputPassword = scanner.nextLine();
                }
            }
        }
    }
}
