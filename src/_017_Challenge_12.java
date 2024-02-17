import java.util.Scanner;

public class _017_Challenge_12 {
    public static void main(String[] args) {
        /*
        * A telephone operator charges $50.00 for a basic plan that
        * entitles you to 100 minutes of telephone time.
        * Each minute that exceeds the 100-minute allowance costs $2.00.
        * Create a program to read the number of minutes a person consumed,
        * then shows the amount to be paid.
        */

        Scanner sc = new Scanner(System.in);

        double fixPlanValue = 50.00;
        int limitMinutes = 100;
        int extraValuePerMinute = 2;

        System.out.print("Enter total minutes consumed: ");
        int consumedMinutes = sc.nextInt();

        if (consumedMinutes > limitMinutes) {

            int  exceededValue =  (consumedMinutes - limitMinutes) * extraValuePerMinute;
            double totalPay = fixPlanValue + exceededValue;

            System.out.printf("Total to pay: $%.2f%n", totalPay);
            System.out.printf("Minutes exceeded: %d%n", exceededValue);

        }else
            System.out.println("You need pay just normal value: " + fixPlanValue);

        sc.close();
    }
}
