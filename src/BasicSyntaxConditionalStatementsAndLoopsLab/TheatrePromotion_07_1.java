package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion_07_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;

        if ("weekday".equals(dayType)) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                ticketPrice = 12;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 18;
            }
        } else if ("weekend".equals(dayType)) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                ticketPrice = 15;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 20;
            }
        } else if ("holiday".equals(dayType)) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 5;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 12;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 10;
            }
        }

        if (ticketPrice != 0) {
            System.out.printf("%d$\n", ticketPrice);
        } else {
            System.out.println("Error!");
        }
    }
}
