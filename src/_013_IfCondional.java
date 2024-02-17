import java.util.Scanner;

public class _013_IfCondional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the houer: ");
        int hour = sc.nextInt();

        if  (hour >= 0 && hour < 12) {
            System.out.println("Good morning");
        } else if (hour < 18) {
            System.out.println("Good evening");
        }else if (hour < 24) {
            System.out.println("Good night");
        }else
            System.out.println("Invalid hour");

        sc.close();
    }
}
