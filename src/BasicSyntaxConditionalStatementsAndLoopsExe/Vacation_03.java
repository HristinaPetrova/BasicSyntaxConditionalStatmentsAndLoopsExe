package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerBusiness = 0;
        double totalPrice = 0;

        switch (day) {
            case "Friday":
                if ("Students".equals(groupType)) {
                    totalPrice = number * 8.45;
                } else if ("Business".equals(groupType)) {
                    pricePerBusiness = 10.90;
                    totalPrice = number * pricePerBusiness;
                } else if ("Regular".equals(groupType)) {
                    totalPrice = number * 15.00;
                }
                break;
            case "Saturday":
                if ("Students".equals(groupType)) {
                    totalPrice = number * 9.80;
                } else if ("Business".equals(groupType)) {
                    pricePerBusiness = 15.60;
                    totalPrice = number * pricePerBusiness;
                } else if ("Regular".equals(groupType)) {
                    totalPrice = number * 20.00;
                }
                break;
            case "Sunday":
                if ("Students".equals(groupType)) {
                    totalPrice = number * 10.46;
                } else if ("Business".equals(groupType)) {
                    pricePerBusiness = 16.00;
                    totalPrice = number * pricePerBusiness;
                } else if ("Regular".equals(groupType)) {
                    totalPrice = number * 22.50;
                }
                break;
        }

        if ("Students".equals(groupType) && number >= 30) {
            totalPrice = totalPrice * 0.85;
        }
        if ("Business".equals(groupType) && number >= 100) {
            totalPrice = totalPrice - 10 * pricePerBusiness;
        }
        if ("Regular".equals(groupType) && number >= 10 && number <= 20) {
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f\n", totalPrice);
    }
}
