import java.util.Scanner;

public class _26_Challenge_20 {
    public static void main(String[] args) {

        /*
        * "Read an undetermined amount of pairs of integer values X and Y.
        * Write a message for each X and Y indicating whether these values
        * were entered in ascending or descending order.
        * The program should terminate when two equal values are entered."
        * */

        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 1;



        while (second != first) {

            System.out.println("Enter 2 numbers: ");
            first = sc.nextInt();
            second = sc.nextInt();

            if (first < second){
                System.out.println("ascending");
            }else {
                System.out.println("descending");
            }


        }



        sc.close();
    }
}
