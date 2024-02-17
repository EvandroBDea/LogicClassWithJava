import java.util.Scanner;

public class _012_Challenge_08 {
    public static void main(String[] args) {
        /*
        * Make a program to read A B and C. Then calculate and show:
        * Area of the square that has side A
        * Area of the triangle that has base A and height B
        * Area of the trapezoid that has bases A and B, and height C
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Value A: ");
        double a = sc.nextDouble();

        System.out.print("Value B: ");
        double b = sc.nextDouble();

        System.out.print("Value C: ");
        double c = sc.nextDouble();

        double square = 4 * a;
        double triangle = (a * b) / 2;
        double trapezoid = ((a + a) * c) / 2 ;

        System.out.printf("Square area %.2f%n", square);
        System.out.printf("Triangle area %.2f%n", triangle);
        System.out.printf("Trapezoid area %.2f", trapezoid);



        sc.close();
    }
}
