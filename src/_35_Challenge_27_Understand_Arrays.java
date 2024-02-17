import java.util.Scanner;

public class _35_Challenge_27_Understand_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How numbers: ");
        int numbers = sc.nextInt();

        int[] a = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.printf("Enter with integer value %d%n", i);
            a[i] = sc.nextInt();
        }

        System.out.println("Values in array: ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
