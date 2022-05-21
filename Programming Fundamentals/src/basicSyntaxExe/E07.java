package basicSyntaxExe;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputCoins = 0.0;
        double coinCounter = 0.0;
        String text = scanner.nextLine();
        double priceNuts = 2.0;
        double priceWater = 0.7;
        double priceCrisps = 1.5;
        double priceSoda = 0.8;
        double priceCoke = 1.0;

        while (!text.equals("Start")){
            inputCoins = Double.parseDouble(text);
            if (inputCoins == 0.1 || inputCoins == 0.2 || inputCoins == 0.5 || inputCoins == 1.0 || inputCoins == 2.0) {
                coinCounter = coinCounter + inputCoins;
            } else {
                System.out.printf("Cannot accept %.2f", inputCoins);
            }
            text = scanner.nextLine();
        }
        while (!text.equals("End") ){
            text = scanner.nextLine();
            if (text.equals("End")){
                break;
            }
            if(text.equals("Nuts")){
                if (coinCounter - priceNuts < 0){
                    System.out.println("Sorry, not enough money");
                } else {
                    coinCounter = coinCounter - priceNuts;
                    System.out.println("Purchased Nuts");
                }
            } else if (text.equals("Water")){
                if (coinCounter - priceWater < 0){
                    System.out.println("Sorry, not enough money");
                } else {
                    coinCounter = coinCounter - priceWater;
                    System.out.println("Purchased Water");
                }
            } else if (text.equals("Crisps")){
                if (coinCounter - priceCrisps < 0){
                    System.out.println("Sorry, not enough money");
                } else {
                    coinCounter = coinCounter - priceCrisps;
                    System.out.println("Purchased Crisps");
                }
            } else if (text.equals("Soda")){
                if (coinCounter - priceSoda < 0){
                    System.out.println("Sorry, not enough money");
                } else {
                    coinCounter = coinCounter - priceSoda;
                    System.out.println("Purchased Soda");
                }
            } else if (text.equals("Coke")){
                if (coinCounter - priceCoke < 0){
                    System.out.println("Sorry, not enough money");
                } else {
                    coinCounter = coinCounter - priceCoke;
                    System.out.println("Purchased Coke");
                }
            } else {
                System.out.println("Invalid product");

            }
        }
        System.out.printf("Change: %.2f",coinCounter);

    }
}
