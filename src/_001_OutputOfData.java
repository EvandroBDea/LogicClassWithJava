public class _001_OutputOfData {
    public static void main(String[] args) {
        System.out.println("Good morning");
        System.out.println("Good night");

        System.out.println("\n=====================\n");

        int a = 32;
        double b = 2.4567;
        String c = "Hello";
        boolean d = true;

        System.out.println(a);
        System.out.printf("thi is the printf: %.2f%n",b );
        System.out.println(c);
        System.out.println(d);

        System.out.println("\n=====================\n");

        int age = 32;
        double salary = 8.325;
        String name = "Barbie Girl";

        System.out.println("The " + name + " has " + age + " years old an your salary is " + salary );
        System.out.printf("The %s has %d years old and you salary is %.3f%n", name, age, salary);

        System.out.println("\n=====================\n");

        // exercise

        String product1 = "Computer";
        String product2 = "TV";
        double price1 = 2100.5;
        double price2 = 1830.0;
        int ageClient = 30;
        int code = 5291;
        char gender = 'F';

        System.out.println("Products");

        System.out.printf("Value of computer is %.2f%n", price1);
        System.out.printf("Value of TV is %.2f%n", price2);

        System.out.println("Code: " + code);

        System.out.printf("Client data:%nGender: %c%nAge: %d%nName: %s ",gender,ageClient,name);
    }
}
