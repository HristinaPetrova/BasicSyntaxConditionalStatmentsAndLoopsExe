package BasicSyntaxConditionalStatementsAndLoopsMore;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int firstPosition = 0;
        int middle = 0;
        int last = 0;

        if (firstNum >= secondNum && firstNum >= thirdNum) {
            firstPosition = firstNum;
            middle = Math.max(secondNum, thirdNum);
            last = Math.min(secondNum, thirdNum);
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            firstPosition = secondNum;
            middle = Math.max(firstNum, thirdNum);
            last = Math.min(firstNum, thirdNum);
        } else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            firstPosition = thirdNum;
            middle = Math.max(firstNum, secondNum);
            last = Math.min(firstNum, secondNum);
        }

        System.out.printf("%d\n%d\n%d\n", firstPosition, middle, last);
    }
}
