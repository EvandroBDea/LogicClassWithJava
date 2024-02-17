import java.util.Scanner;

public class _020_Challenge_15 {
    public static void main(String[] args) {
        /*
        * In the javelin throw, the athlete has 3 chances to
        * throw the javelin as far as possible.
        * You must create a program to read the distances of the three
        * attempts and mark the one that covered the greatest distance.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("First try");
        double first = sc.nextDouble();

        System.out.println("Second try");
        double second = sc.nextDouble();

        System.out.println("Third try");
        double third = sc.nextDouble();

        if (first > second && first > third) {
            System.out.println("Longest throw: " + first);
        } else if (second > first && second > third) {
            System.out.println("Longest throw: " + second);
        }else {
            System.out.println("Longest throw: " + third);

            sc.close();
        }
    }
}