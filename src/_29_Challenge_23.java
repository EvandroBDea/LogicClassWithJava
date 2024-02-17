import java.util.Scanner;

public class _29_Challenge_23 {
    public static void main(String[] args) {
        /*
        * Write a program to read the coordinates (X, Y) of an undetermined quantity of points in the Cartesian system.
        * For each point, output the quadrant to which it belongs (Q1, Q2, Q3, or Q4).
        * The algorithm will terminate when at least one of the two coordinates
        * is NULL (in this situation, without displaying any message).
        */

        Scanner sc = new Scanner(System.in);

        int x = 1;
        int y = 1;

        while (x != 0 && y != 0) {

            System.out.println("Enter x: ");
            x = sc.nextInt();

            System.out.println("Enter y: ");
            y = sc.nextInt();

            if (y > 0 && x > 0) {
                System.out.println("Q1");
            } else if (y < 0 && x > 0) {
                System.out.println("Q2");
            } else if (y < 0 && x < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }

        }

        System.out.println("End Program.");

        // this was har  ^^




        sc.close();
    }
}
