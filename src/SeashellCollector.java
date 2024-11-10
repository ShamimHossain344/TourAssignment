import java.util.Scanner;

public class SeashellCollector {

    public static void main(String[] args) {

        int[] seashells = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seashell Collection Program");
        boolean collecting = true;

        while (collecting) {
            System.out.println("\nChoose a seashell type to collect:");
            for (int i = 0; i < seashells.length; i++) {
                System.out.println("Type " + (i + 1) + " (Collected: " + seashells[i] + ")");
            }
            System.out.println("6. View total seashells collected");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                seashells[choice - 1]++;
                System.out.println("Collected one seashell of type " + choice);
            } else if (choice == 6) {
                printTotalSeashells(seashells);
            } else if (choice == 7) {
                collecting = false;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }

    public static void printTotalSeashells(int[] seashells) {
        int total = 0;
        for (int count : seashells) {
            total += count;
        }
        System.out.println("Total seashells collected: " + total);
    }
}
