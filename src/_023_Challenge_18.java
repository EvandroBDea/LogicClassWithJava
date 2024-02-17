import java.util.Scanner;

public class _023_Challenge_18 {
    public static void main(String[] args) {
        /*
        * A company will grant a percentage increase in salary.
        * Based on the information, create a program to calculate
        * the increase according to salary.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with your salary: ");
        double salary = sc.nextDouble();

        double newSalary;

        if (salary <= 1000) {
            newSalary = salary + (salary * 0.20);
            System.out.printf("Your new salary is: $R%.2f", newSalary );
        }else if (salary <= 3000) {
            newSalary = salary + (salary * 0.15);
            System.out.printf("Your new salary is: $R%.2f", newSalary );
        } else if (salary <= 8000) {
            newSalary = salary + (salary * 0.10);
            System.out.printf("Your new salary is: $R%.2f", newSalary );
        }else {
            newSalary = salary + (salary * 0.05);
            System.out.printf("Your new salary is: $R%.2f", newSalary );
        }


        sc.close();
    }
}
