import java.util.Scanner;

public class _019_Challenge_14 {
    public static void main(String[] args) {

        /*
        * Create a program to read the amount of glucose in a person's
        * blood and then show the classification on the screen according
        * to the following: up to 100mg/dl normal,
        * high between 100 and 140mg/dl, and more than 140mg/dl diabetes
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with your glucose: ");
        int glucose = sc.nextInt();

        if (glucose < 100) {
            System.out.println("Glucose is normal");
        }else if (glucose <= 140) {
            System.out.println("Glucose is high");
        }else {
            System.out.println("You has diabetes");
        }

        sc.close();
    }
}
