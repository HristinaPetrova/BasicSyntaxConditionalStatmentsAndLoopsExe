package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int ednNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= ednNum; i++) {
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.printf("\nSum: %d\n", sum);
    }
}
