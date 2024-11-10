import java.util.Scanner;

public class SouvenirShopping {

    public static void main(String[] args) {
        String[] souvenirs = {"T-shirt", "Mug", "Keychain", "Hat", "Postcard"};
        double[] prices = {15.00, 7.50, 3.00, 12.00, 1.50};

        int[] cart = new int[souvenirs.length];

        Scanner scanner = new Scanner(System.in);

        // Display the available souvenirs and their prices
        System.out.println("Welcome to the souvenir shop!");
        System.out.println("Here are the available souvenirs and their prices:");
        for (int i = 0; i < souvenirs.length; i++) {
            System.out.println((i + 1) + ". " + souvenirs[i] + " - $" + prices[i]);
        }

        boolean shopping = true;
        while (shopping) {
            System.out.println("\nEnter the number of the souvenir you'd like to buy (or 0 to finish shopping): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                shopping = false;
            } else if (choice > 0 && choice <= souvenirs.length) {
                System.out.println("How many " + souvenirs[choice - 1] + "(s) would you like to buy?");
                int quantity = scanner.nextInt();
                cart[choice - 1] += quantity;  // Add the quantity to the cart
                System.out.println("Added " + quantity + " " + souvenirs[choice - 1] + "(s) to your cart.");
            } else {
                System.out.println("Invalid choice, please select a valid souvenir number.");
            }
        }

        // Calculate the total cost of the souvenirs in the cart
        double totalCost = 0.0;
        for (int i = 0; i < cart.length; i++) {
            totalCost += cart[i] * prices[i];
        }

        // Display the items in the cart and the total cost
        System.out.println("\nYour shopping cart:");
        for (int i = 0; i < souvenirs.length; i++) {
            if (cart[i] > 0) {
                System.out.println(cart[i] + " " + souvenirs[i] + "(s) - $" + (cart[i] * prices[i]));
            }
        }

        System.out.println("\nTotal cost: $" + totalCost);
        System.out.println("Thank you for shopping with us!");
    }
}
