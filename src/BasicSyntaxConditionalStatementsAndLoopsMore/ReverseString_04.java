package BasicSyntaxConditionalStatementsAndLoopsMore;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverse = "";

        for (int symbol = input.length() - 1; symbol >= 0; symbol--) {
            char currentSymbol = input.charAt(symbol);
            reverse += currentSymbol;
        }
        System.out.printf("%s\n", reverse);
    }
}
