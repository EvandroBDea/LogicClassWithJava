import java.util.Scanner;

public class _36_Challenge_28_Arrays_Negatives_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How number: ");
        int numbers = sc.nextInt();

        int[] a = new int[numbers];
        int[] b = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            System.out.printf("Enter with integer value %d%n: ", i);
            a[i] = sc.nextInt();
            if (a[i] < 0) {
                int add = 0;
                b[add] = a[i];
                add++;
                
            }
        }

        System.out.println("Negatives numbers in array");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        sc.close();
    }
}
