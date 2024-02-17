import java.util.Scanner;

public class _33_TryingMakeMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a number: ");
        int number = sc.nextInt();

        for (int i = 0; i <= 10; i++ ) {

            System.out.println(number + " x " + i  +  " = " + (number * i) );
        }

        sc.close();
    }
}
