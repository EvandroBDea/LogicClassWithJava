import java.util.Scanner;

public class _005_Challenge_01 {
    public static void main(String[] args) {
        /*
        * Make a program to read the measurements of the width and length
        * of a rectangular plot to one decimal place, give the value of the square meter
        * to two decimal places.
        * Then the program must show the value of the land area and the total value of
        * the land, both with two decimal places.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Length: ");
        double length = sc.nextDouble();

        System.out.println("Width: ");
        double width = sc.nextDouble();

        System.out.println("Price of meters²: ");
        double sqrtMeters = sc.nextDouble();

        double area = length *  width;
        double priceOfLand = area * sqrtMeters;

        System.out.printf("The land has total area: %.2f%n", area);
        System.out.printf("The value total of land is: %.1f", priceOfLand);

        sc.close();

    }
}
