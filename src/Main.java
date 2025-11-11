import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter credit card limit: ");
        double limit = scanner.nextDouble();
        CreditCard card = new CreditCard(limit);
        scanner.nextLine();

        int optionChosen = 0;
        while (optionChosen != 3) {
            System.out.printf("""
                    -- Nature Tech Online Shop --
                    
                              Welcome
                     Please select from the menu
                    
                    1. Shop
                    2. Check Purchases
                    3. Leave
                    """);
            optionChosen = scanner.nextInt();
            scanner.nextLine();

            if (optionChosen == 1) {
                int exit = 1;
                while(exit != 0) {
                    System.out.println("Enter purchase description:");
                    String description = scanner.nextLine();

                    System.out.println("Enter purchase value:");
                    double value = scanner.nextDouble();

                    Purchase purchase = new Purchase(description, value);
                    boolean purchaseCompleted = card.launchPurchase(purchase);

                    if (purchaseCompleted) {
                        System.out.println("Purchase completed!");
                        System.out.println("Enter 0 to exit or 1 to continue");
                        exit = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Insufficient balance!");
                        exit = 0;
                    }
                }
            }

            if (optionChosen == 2) {
                System.out.println("***********************");
                System.out.println("COMPLETED PURCHASES:\n");

                Collections.sort(card.getPurchases());

                for (Purchase p : card.getPurchases()) {
                    System.out.println(p.getDescription() + " - " + p.getValue());
                }
                System.out.println("\n***********************");
                System.out.println("\nCard balance: " + card.getBalance());
                System.out.println();
            }
        }
        System.out.println("See you soon!");
    }
}