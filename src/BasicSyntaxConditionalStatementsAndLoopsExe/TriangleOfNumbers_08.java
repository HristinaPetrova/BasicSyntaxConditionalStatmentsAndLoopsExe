package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= number; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.printf("%d ", rows);
            }
            System.out.println();
        }
    }
}
