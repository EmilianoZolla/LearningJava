package basicSyntaxExe;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;
        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double inputMoney = Double.parseDouble(input);
            if (inputMoney == 0.1 || inputMoney == 0.2 || inputMoney == 0.5 || inputMoney == 1 || inputMoney == 2) {
                sum += inputMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputMoney);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
                while (!product.equals("End")) {
                if (product.equals("Nuts") || product.equals("Water") || product.equals("Crisps") || product.equals("Soda") || product.equals("Coke")){
                switch (product){
                    case "Nuts":
                        if (sum - nutsPrice >= 0){
                            sum -= nutsPrice;
                            System.out.println("Purchased Nuts");
                        }else{
                            System.out.println("Sorry, not enough money");
                        }
                        product = scanner.nextLine();
                        break;
                        case "Water":
                            if (sum - waterPrice >= 0){
                                sum -= waterPrice;
                                System.out.println("Purchased Water");
                            }else{
                                System.out.println("Sorry, not enough money");
                            }
                            product = scanner.nextLine();
                            break;
                    case "Crisps":
                        if (sum - crispsPrice >= 0){
                            sum -= crispsPrice;
                            System.out.println("Purchased Crisps");
                        }else{
                            System.out.println("Sorry, not enough money");
                        }
                        product = scanner.nextLine();
                        break;
                    case "Soda":
                        if (sum - sodaPrice >= 0){
                            sum -= sodaPrice;
                            System.out.println("Purchased Soda");
                        }else{
                            System.out.println("Sorry, not enough money");
                        }
                        product = scanner.nextLine();
                        break;
                    case "Coke":
                        if (sum - cokePrice >= 0){
                            sum -= cokePrice;
                            System.out.println("Purchased Coke");
                        }else{
                            System.out.println("Sorry, not enough money");
                        }
                        product = scanner.nextLine();
                        break;
                    }
                }else{
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                }
            }
        System.out.printf("Change: %.2f", sum);
    }
}
