import java.util.Scanner;

public class _28_Challenge_22 {
    public static void main(String[] args) {
        /*
        * Write a program that repeats the input of a password until it is valid.
        * For each incorrect password entered, write the message "Invalid Password! Try again:".
        * When the correct password is entered, the message "Access Granted" should be printed,
        * and the algorithm terminated. Consider that the correct password is the value 2002.
        * */

        Scanner sc = new Scanner(System.in);

        int realPassword = 2002;


        System.out.println("Password: ");
        int password = sc.nextInt();

        if (realPassword == password) {
            System.out.println("Access granted.");
        }else {
            while (realPassword != password) {
                System.out.println("Invalid password");
                System.out.println("Password: ");
                password = sc.nextInt();
            }
            System.out.println("Access granted.");
        }


        sc.close();
    }
}
