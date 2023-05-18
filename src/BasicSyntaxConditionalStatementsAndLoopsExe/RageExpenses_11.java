package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double damageCosts = 0;

        if (lost >= 2) {
            damageCosts = damageCosts + ((lost / 2) * headsetPrice);
        }
        if (lost >= 3) {
            damageCosts = damageCosts + ((lost / 3) * mousePrice);
        }
        if (lost >= 6) {
            damageCosts = damageCosts + ((lost / 6) * keyboardPrice);
        }
        if (lost >= 12) {
            damageCosts = damageCosts + ((lost / 12) * displayPrice);
        }

        System.out.printf("Rage expenses: %.2f lv.\n",damageCosts);
    }
}
