import java.util.Scanner;

public class _011_Challenge_07 {
    public static void main(String[] args) {
        /*
        * Make a program to read the total distance (in km)
        * covered by a car as well as the total fuel used by
        * this car when covering that distance.
        * The program shows the average consumption of the car
        * with three decimal places.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Travelled distance: ");
        double travelledDistance = sc.nextDouble();

        System.out.println("Fuel used: ");
        double fuelUsed = sc.nextDouble();

        double spentFuel = travelledDistance / fuelUsed;

        System.out.printf("Spent fuel is  %.3f", spentFuel);

        sc.close();
    }
}
