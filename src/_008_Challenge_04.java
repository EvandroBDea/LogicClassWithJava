import java.util.Scanner;

public class _008_Challenge_04 {
    public static void main(String[] args) {
        /*
        * Create a program to calculate change in the payment process
        * for a market product.
        * The program must read the unit price of the product,
        * the number of units purchased of this product and the value
        * given by the customer (assuming there is enough money).
        * Your program must show the value of the change to
        * be returned to the customer
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Unit price of product: ");
        double unitPrice = sc.nextDouble();

        System.out.println("Amount of product: ");
        int amountProduct = sc.nextInt();

        System.out.println("Amount paid");
        double amountPaid = sc.nextDouble();

        double moneyChange =  amountPaid - (unitPrice * amountProduct);

        System.out.printf("You need give back: %.2f ", moneyChange);

        sc.close();
    }
}
