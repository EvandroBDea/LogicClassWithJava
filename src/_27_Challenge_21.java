import java.util.Scanner;

public class _27_Challenge_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfAges = 0;
        int numberOfIndividuals = 0;

        System.out.println("Enter the age (or a negative number to finish): ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("IMPOSSIBLE TO CALCULATE");
        } else {
            while (age >= 0) {
                sumOfAges += age;
                numberOfIndividuals += 1;

                System.out.println("Enter the age (or a negative number to finish): ");
                age = sc.nextInt();
            }

            if (numberOfIndividuals > 0) {
                double averageAge = (double) sumOfAges / numberOfIndividuals;
                System.out.println("The average age of the group is: " + averageAge);
            } else {
                System.out.println("IMPOSSIBLE TO CALCULATE");
            }
        }

        sc.close();
    }
}
