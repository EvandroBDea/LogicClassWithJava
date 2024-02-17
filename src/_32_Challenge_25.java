import java.util.Scanner;

public class _32_Challenge_25 {
    public static void main(String[] args) {
        /*
        * A gas station wants to determine which of its products is preferred by its customers.
        * Write an algorithm to read the type of fuel filled
        * (coded as follows: 1. Alcohol 2. Gasoline 3. Diesel 4. End).
        * If the user enters an invalid code (outside the range of 1 to 4),
        * a new code should be requested (until it is valid).
        * The program will be terminated when the entered code is the number 4, and then it should display
        * the message "THANK YOU VERY MUCH," as well as the quantities of each fuel.
        */

        Scanner sc       = new Scanner(System.in);

        int alcohol = 1;
        int gasoline = 1;
        int diesel = 1;
        int stop = 1;


        System.out.printf("Enter: " +
                "\n1 to Alcohol +" +
                "\n2 to Gasoline" +
                "\n3 to Diesel" +
                "\n4 to Stop\n");
        int product = sc.nextInt();;

        while (product > 4 || product < 1){
            System.out.println("Invali code!");
            System.out.printf("Enter: " +
                    "\n1 to Alcohol " +
                    "\n2 to Gasoline" +
                    "\n3 to Diesel" +
                    "\n4 to Stop\n");
            product = sc.nextInt();;
        }

        switch (product) {
            case 1 -> System.out.println("Alcohol");
            case 2 -> System.out.println("Gasoline");
            case 3 -> System.out.println("Diesel");
            case 4 -> {
                System.out.println("Exiting");
                break;
            }
        }






        sc.close();
    }
}
