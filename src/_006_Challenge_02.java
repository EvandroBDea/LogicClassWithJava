import java.util.Scanner;

public class _006_Challenge_02 {
    public static void main(String[] args) {
        /*
         * Make a program to read the measurements of the base and
         * height of a rectangle.
         * Show the area, perimeter and diagonal of this
         * rectangle with four decimal places
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("DATA OF RECTANGLE");

        System.out.println("Base: ");
        double base = sc.nextDouble();

        System.out.println("Height: ");
        double height = sc.nextDouble();

        double perimeter = 2 * (base + height);
        double diagonal = Math.sqrt((Math.pow(base,2) + Math.pow(height,2)));
        double area = base * height;

        System.out.printf("Area %.4f%n",area);
        System.out.printf("Perimeter %.4f%n",perimeter);
        System.out.printf("Diagonal %.4f%n",diagonal);




        sc.close();
    }
}
