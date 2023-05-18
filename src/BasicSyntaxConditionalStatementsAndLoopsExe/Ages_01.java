package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());

        String age = "";

        if (years >= 0 && years <= 2) {
            age = "baby";
        } else if (years <= 13) {
            age = "child";
        } else if (years <= 19) {
            age = "teenager";
        } else if (years <= 65) {
            age = "adult";
        } else if (years >= 66) {
            age = "elder";
        }

        System.out.printf("%s\n", age);
    }
}
