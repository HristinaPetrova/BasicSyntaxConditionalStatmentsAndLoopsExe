package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int symbol = userName.length() - 1; symbol >= 0; symbol--) {
            char currentSymbol = userName.charAt(symbol);
            password += currentSymbol;
        }

        int countIncorrectPass = 0;
        String pass = scanner.nextLine();

        while (!pass.equals(password)) {
            countIncorrectPass++;

            if (countIncorrectPass == 4) {
                System.out.printf("User %s blocked!\n", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }

        if (password.equals(pass)){
            System.out.printf("User %s logged in.", userName);
        }

    }
}

