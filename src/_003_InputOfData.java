import java.util.Scanner;

public class _003_InputOfData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your name here:  ");
        String name = sc.next();

        System.out.println("Your input was:");
        System.out.println(name);


        sc.close();
    }
}
