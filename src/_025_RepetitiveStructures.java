import java.util.Scanner;

public class _025_RepetitiveStructures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 99;
        int sum = 0;

        System.out.println("Enter wiht a number: ");
        sum = sc.nextInt();


        while (number != 0) {
            System.out.println("Enter wiht a number: ");
            number = sc.nextInt();
            sum = sum + number;
        }

        System.out.println("Sum is: " + sum);


        sc.close();
    }
}
