import java.util.Scanner;

public class IT26102304Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = scanner.nextInt();

        // Arrays for denominations and their labels (Notes vs Coins)
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] types = {
            "Notes", "Notes", "Notes", "Notes", "Notes", "Notes", "Notes",
            "Coins", "Coins", "Coins", "Coins"
        };

        int tempAmount = amount;

        for (int i = 0; i < denominations.length; i++) {
            int count = tempAmount / denominations[i];
            tempAmount %= denominations[i];

            // Print formatted output (padding single-digit denominations like 05, 02, 01)
            System.out.printf("%02d %s -- %d%n", denominations[i], types[i], count);
        }

        scanner.close();
    }
}