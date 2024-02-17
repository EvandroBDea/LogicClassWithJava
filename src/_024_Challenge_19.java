import java.util.Scanner;

public class _024_Challenge_19 {
    public static void main(String[] args) {

    /*
     * In a bar, admission costs $10 for men and $8 for women.
     * Each beer costs $5, each soft drink costs $3, and each skewer costs $7.
     * In addition, the bar charges an artistic cover fee of $4,
     * however if the amount spent on cover exceeds $30, the artistic cover is not charged.
     * Make a program to read the data and calculate the total amount following the rules mentioned. .
     */

    Scanner sc = new Scanner(System.in);

        double beer = 5;
        double softDrink = 3;
        double skewer = 7;
        double artisticCoverFee = 4;
        double pass = 0;

        System.out.println("Enter W to woman and M to man: ");
        String client = sc.nextLine();
        client = client.toUpperCase();

        if (client.equals("W")) {
            pass = 8;
        }else {
            pass = 10;
        }

        System.out.println("Units soft drink");
        int  unitsSoftDrink = sc.nextInt();

        System.out.println("Units beer");
        int  unitsBeer = sc.nextInt();

        System.out.println("Units skewer");
        int  unitsSkewer = sc.nextInt();

        double total = (unitsBeer * beer) + (unitsSkewer * skewer) + (unitsSoftDrink * softDrink) + pass;

        if (total > 30) {
            System.out.printf("You need pay: $%.2f", total);
        }else {
            System.out.printf("You need pay: $%.2f", total + artisticCoverFee);

        }


    sc.close();
    }
}
