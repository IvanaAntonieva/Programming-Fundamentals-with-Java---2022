package Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double area =  printRectangleArea(width, length);
        System.out.printf("%.0f", area);
    }
    public static double printRectangleArea(double widthRec, double lengthRec) {
        return widthRec * lengthRec;
    }
}
