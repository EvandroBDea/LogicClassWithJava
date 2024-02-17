import java.util.Scanner;

public class _30_Challenge_24 {
    public static void main(String[] args) {
        /*
         * Create a program that reads the grades for two assessments of a student.
         * Calculate and print the semester average. Ensure that the algorithm only accepts
         * valid grades (a valid grade must belong to the range [0, 10]).
         * Each grade should be validated separately.
         */

        Scanner sc = new Scanner(System.in);


        System.out.println("First grade: ");
        int grade1 = sc.nextInt();

        System.out.println("Second grade: ");
        int grade2 = sc.nextInt();

        boolean areGradesValid = (grade1 >= 0 && grade1 <= 10 && grade2 >= 0 && grade2 <= 10);


        while (!areGradesValid) {

            System.out.println("Invalid grades please enter grade between 0-10:");

            System.out.println("First grade: ");
            grade1 = sc.nextInt();

            System.out.println("Second grade: ");
            grade2 = sc.nextInt();
        }

        double average = (double)(grade1 + grade2) / 2;

        System.out.println("Average: " + average);


        sc.close();
    }
}


