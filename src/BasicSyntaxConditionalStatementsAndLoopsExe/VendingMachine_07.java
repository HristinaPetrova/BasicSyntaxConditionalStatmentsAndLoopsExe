package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coins = scanner.nextLine();
        double sum = 0;

        while (!"Start".equals(coins)) {
            double currentCoin = Double.parseDouble(coins);
            if (currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5 || currentCoin == 1 || currentCoin == 2) {
                sum += currentCoin;
            } else {
                System.out.printf("Cannot accept %.2f\n", currentCoin);
            }
            coins = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!"End".equals(product)) {
            switch (product) {
                case "Nuts":
                    if (sum < 2) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 2.0;
                        System.out.printf("Purchased %s\n", product);
                    }
                    break;
                case "Water":
                    if (sum < 0.7) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 0.7;
                        System.out.printf("Purchased %s\n", product);
                    }
                    break;
                case "Crisps":
                    if (sum < 1.5) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 1.5;
                        System.out.printf("Purchased %s\n", product);
                    }
                    break;
                case "Soda":
                    if (sum < 0.8) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 0.8;
                        System.out.printf("Purchased %s\n", product);
                    }
                    break;
                case "Coke":
                    if (sum < 1) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        sum -= 1.0;
                        System.out.printf("Purchased %s\n", product);
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n", sum);

    }
}
