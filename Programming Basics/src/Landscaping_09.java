import java.util.Scanner;

public class Landscaping_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqm = Double.parseDouble(scanner.nextLine());
        double price = sqm * 7.61;
        double discount = price * 0.18;
        double priceWithDiscount = price - discount;
        System.out.println( "The final price is: " + priceWithDiscount + " lv." );
        System.out.println( "The discount is: " + discount + " lv." );
    }
}