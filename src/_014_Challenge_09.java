import java.util.Scanner;

public class _014_Challenge_09 {
    public static void main(String[] args) {
        /*
        * Create a program to read two grades that a student
        * obtained in the first and second semesters of an
        * annual course.
        * Then, display the final grade that the student
        * achieved (with one decimal place) for the year,
        * along with an explanatory text. If the student's
        * final grade is less than 60.00, display the message
        * "Not passed" on the screen.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Grade of first semester: ");
        double firstGrade = sc.nextDouble();

        System.out.println("Grade of second semester: ");
        double secondGrade = sc.nextDouble();

        double finalGrade = (firstGrade + secondGrade) / 2;

        if (finalGrade < 60) {
            System.out.println("Not passed");
        }else
            System.out.println(finalGrade);

        sc.close();
    }
}
