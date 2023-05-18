package BasicSyntaxConditionalStatementsAndLoopsMore;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double restMoney = budget;

        while (!"Game Time".equals(game)) {
            double currentPrice = 0;
            boolean expensive = false;
            boolean notFound = false;

            if ("OutFall 4".equals(game) || "RoverWatch Origins Edition".equals(game)) {
                currentPrice = 39.99;
                if (restMoney < currentPrice) {
                    expensive = true;
                } else {
                    restMoney -= currentPrice;
                }
            } else if ("CS: OG".equals(game)) {
                currentPrice = 15.99;
                if (restMoney < currentPrice) {
                    expensive = true;
                } else {
                    restMoney -= currentPrice;
                }
            } else if ("Zplinter Zell".equals(game)) {
                currentPrice = 19.99;
                if (restMoney < currentPrice) {
                    expensive = true;
                } else {
                    restMoney -= currentPrice;
                }
            } else if ("Honored 2".equals(game)) {
                currentPrice = 59.99;
                if (restMoney < currentPrice) {
                    expensive = true;
                } else {
                    restMoney -= currentPrice;
                }
            } else if ("RoverWatch".equals(game)) {
                currentPrice = 29.99;
                if (restMoney < currentPrice) {
                    expensive = true;
                } else {
                    restMoney -= currentPrice;
                }
            } else {
                notFound = true;
                System.out.println("Not Found");
            }

            if (expensive) {
                System.out.println("Too Expensive");
            } else if (!notFound) {
                System.out.printf("Bought %s\n", game);
            }

            if (restMoney <= 0) {
                System.out.println("Out of money!");
                break;
            }

            game = scanner.nextLine();
        }

        if ("Game Time".equals(game)) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", (budget - restMoney), restMoney);
        }
    }
}
