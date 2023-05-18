package BasicSyntaxConditionalStatementsAndLoopsMore;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int lastNum = number % 10;

        String[] digit = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(digit[(lastNum)]);

    }
}
