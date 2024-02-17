import java.util.Scanner;

public class _016_Challenge_11 {
    public static void main(String[] args) {
        /*
        * Make a program to select a number of 1 to 7 and
        * this number represent a day of week.
        * If number selected not is in rang 1-7 show this message
        * Number invalid
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with a number between 1-7 to represent days of week: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid number");
        }

        sc.close();

    }
}
