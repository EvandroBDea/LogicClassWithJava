import java.util.Scanner;

public class _34_Challenge_26 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String response = "y";

        while (response.equals("y")) {
            System.out.println("Enter Celsius scale for convert to Fahrenheit? ");
            double c = sc.nextDouble();

            double f = 9.0 * c / 5.0 + 32.0;

            System.out.printf("Fahrenheit: %.1f\n", f);

            System.out.println("Do you want to repeat? (y or n) ");
            response = sc.next();
        }

        System.out.println("End Program.");

        sc.close();
    }
}
