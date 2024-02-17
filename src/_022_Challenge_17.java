import java.util.Scanner;

public class _022_Challenge_17 {
    public static void main(String[] args) {
        /*
        * Make a program to read two integers and tell if
        * one number is a multiple of the other.
        * Numbers can be entered in any order.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        double firstNumber = sc.nextDouble();

        System.out.println("Second number: ");
        double secondNumber = sc.nextDouble();

        double multiple = secondNumber % firstNumber;

        if (multiple == 0) {
            System.out.println("Is multiple");
        }else
            System.out.println("Not is multiple");

        sc.close();
    }
}
