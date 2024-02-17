import java.util.Scanner;

public class _009_Challenge_05 {
    public static void main(String[] args) {
        /*
        * Make a program to read the r value of the radius of a circle,
        * and then display the value of the circle's area with three decimal places.
        * The formula for the circle's area is as follows: area = PI.r².
        * You can use the value of PI provided by the language library.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Radius value: ");
        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("Area: %.3f", area);

        sc.close();
    }
}
