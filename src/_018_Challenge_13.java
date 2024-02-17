import java.util.Scanner;

public class _018_Challenge_13 {
    public static void main(String[] args) {

        /*
        * Create a program to calculate change in the payment process for a product in a market.
        * The program must read the unit price of the product, the quantity of the product and the
        * amount of money paid by the customer.
        * The program must show the change to be returned and the total purchase amount.
        * If the money paid is not enough, a message will be displayed informing you of the missing amount.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Product value:  ");
        double productValue = sc.nextDouble();

        System.out.println("Product units:  ");
        int units = sc.nextInt();

        System.out.println("Money received");
        double moneyReceived = sc.nextDouble();

        double totalToPay = productValue * units;

        System.out.println("Total to pay: " + totalToPay);


        if (moneyReceived < totalToPay) {

            double needPay = totalToPay - moneyReceived;

            System.out.printf("You need pay: $%.2f%n", needPay);

        }else {

            double changeMoney = moneyReceived - totalToPay;

            System.out.printf("Your change money is $%.2f%n", changeMoney);
        }
        sc.close();
    }
}
