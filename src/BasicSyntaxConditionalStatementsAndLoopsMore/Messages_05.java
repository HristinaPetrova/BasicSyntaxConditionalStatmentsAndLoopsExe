package BasicSyntaxConditionalStatementsAndLoopsMore;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInput = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = 1; i <= numberOfInput; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum == 0) {
                output += " ";
            } else {
                int countDigits = (currentNum + "").length();
                int mainDigit = currentNum % 10;
                int offset = (mainDigit - 2) * 3;

                if (mainDigit > 7) {
                    offset++;
                }

                int letter = 97 + (offset + countDigits - 1);
                char indexCurrentLetter = (char) letter;
                output += indexCurrentLetter;
            }
        }
        System.out.println(output);
    }
}

