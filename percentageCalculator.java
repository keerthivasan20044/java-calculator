import java.util.Scanner;

class PercentageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {

            System.out.println("\n==========================");
            System.out.println("   Percentage Calculator  ");
            System.out.println("==========================\n");

            System.out.print("Enter obtained marks : ");
            double obtained = sc.nextDouble();

            System.out.print("Enter total marks    : ");
            double total = sc.nextDouble();

            // Validation
            if (total <= 0) {
                System.out.println("Invalid! Total marks cannot be zero.");
            }
            else if (obtained < 0) {
                System.out.println("Invalid! Marks cannot be negative.");
            }
            else if (obtained > total) {
                System.out.println("Invalid! Obtained marks exceed total.");
            }
            else {
                double percentage = (obtained / total) * 100;
                String result     = (percentage >= 35) ? "PASS" : "FAIL";

                System.out.println("\n==========================");
                System.out.printf ("Obtained   : %.2f%n",   obtained);
                System.out.printf ("Total      : %.2f%n",   total);
                System.out.printf ("Percentage : %.2f%%%n", percentage);
                System.out.println("Result     : " + result);
                System.out.println("==========================");
            }

            // Ask again
            System.out.print("\nCalculate again? (yes/no) : ");
            choice = sc.next();
        }

        System.out.println("\nThank you! Goodbye.");
        sc.close();
    }
}
