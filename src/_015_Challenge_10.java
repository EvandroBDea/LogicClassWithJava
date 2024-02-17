import java.util.Scanner;

public class _015_Challenge_10 {
    public static void main(String[] args) {
        /*
        *Make a program to read three integers.
        * Then show which is the least of the three numbers.
        * In case of a tie, show only once.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int number1 = sc.nextInt();

        System.out.println("Second number: ");
        int number2 = sc.nextInt();

        System.out.println("Third number: ");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3){
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else
            System.out.println(number3);


        sc.close();
    }
}
