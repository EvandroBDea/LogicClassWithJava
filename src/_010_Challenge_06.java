import java.util.Scanner;

public class _010_Challenge_06 {
    public static void main(String[] args) {
        /*
        * Make a program to read an employee's name,
        * the amount he receives per hour, and the number of
        * hours worked by him.
        * At the end, show the employee's payment amount
        * with an explanatory message
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.next();

        System.out.println("Value per hour: ");
        double valueHour = sc.nextDouble();

        System.out.println("Worked hours: ");
        int workedHour = sc.nextInt();

        double payment = workedHour * valueHour;

        System.out.printf("%s your payment today is R$%.2f%n", name, payment);

        sc.close();
    }
}
