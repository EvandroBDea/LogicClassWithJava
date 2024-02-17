import java.util.Scanner;

public class _021_Challenge_16 {
    public static void main(String[] args) {
        /*
        * A coffee shop has several products.
        * Each product has a code and a price.
        * You must create a program to read the code
        * and quantity purchased of a product (assuming a valid code),
        * then enter the amount to be paid, with two decimal places,
        * according to the table provided.
        */

        Scanner sc = new Scanner(System.in);

        double product1 = 5.00;
        double product2 = 3.50;
        double product3 = 4.80;
        double product4 = 8.90;
        double product5 = 7.32;

        System.out.print("Enter with product code between 1-5: ");
        int product = sc.nextInt();

        System.out.print("Product units: ");
        int units = sc.nextInt();

        double total = 0;    System.out.println();


        switch (product) {
            case 1 ->  total = product1 * units;
            case 2 ->  total = product2 * units;
            case 3 ->  total = product3 * units;
            case 4 ->  total = product4 * units;
            case 5 ->  total = product5 * units;
        }

        System.out.printf("Total to pay: %.2f", total);

        sc.close();
    }
}
