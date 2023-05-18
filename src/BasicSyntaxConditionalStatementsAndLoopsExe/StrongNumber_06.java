package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNum = number;
        int sumFactorial = 0;

        while (startNum > 0) {
            int lastNum = startNum % 10;
            int factorial = 1;
            for (int i = 1; i <= lastNum; i++) {
                factorial *= i;
            }
            sumFactorial += factorial;
            startNum = startNum / 10;
        }

        if (number == sumFactorial) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
