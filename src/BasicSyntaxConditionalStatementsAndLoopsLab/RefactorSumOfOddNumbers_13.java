package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class RefactorSumOfOddNumbers_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int count = 0;

        for (int i = 1; i >= count; i += 2) {
            System.out.printf("%d\n", i);
            count++;
            sum += i;
            if (count == n) {
                break;
            }
        }
        System.out.printf("Sum: %d%n", sum);
    }
}

