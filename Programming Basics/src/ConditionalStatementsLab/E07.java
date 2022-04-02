package ConditionalStatementsLab;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFigure = scanner.nextLine();
        switch (typeOfFigure) {
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                double area = a * a;
                System.out.printf("%.3f", area);
                break;
            case "rectangle":
                double sideA = Double.parseDouble(scanner.nextLine());
                double sideB = Double.parseDouble(scanner.nextLine());
                double areaOfRectangle = sideA * sideB;
                System.out.printf("%.3f", areaOfRectangle);
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                double areaOfCircle = radius * radius * Math.PI;
                System.out.printf("%.3f", areaOfCircle);
                break;
            case "triangle":
                double sideOne = Double.parseDouble(scanner.nextLine());
                double sideOneHeight = Double.parseDouble(scanner.nextLine());
                double areaOfTriangle = 0.5 * sideOne * sideOneHeight;
                System.out.printf("%.3f", areaOfTriangle);
                break;

        }
    }

}
// ⦁	Лица на фигури
//Да се напише програма, в която потребителят въвежда вида и размерите на геометрична фигура и пресмята лицето й.
// Фигурите са четири вида: квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle).
// На първия ред на входа се чете вида на фигурата (текст със следните възможности: square, rectangle, circle или triangle).
//⦁	Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
//⦁	Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
//⦁	Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
//⦁	Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и
// дължината на височината към нея
//Резултатът да се закръгли до 3 цифри след десетичната запетая.