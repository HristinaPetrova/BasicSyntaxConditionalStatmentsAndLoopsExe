package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;

        for (int i = 1; i >= count; i += 2) {
            count++;
            sum += i;
            System.out.println(i);
            if (count == number) {
                break;
            }
        }
        System.out.printf("Sum: %d\n", sum);
    }
}
