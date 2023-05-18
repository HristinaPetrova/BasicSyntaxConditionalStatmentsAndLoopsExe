package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        boolean error = false;

        if (age < 0 || age > 122) {
            error = true;
        } else if (age <= 18) {
            if ("Weekday".equals(dayType)) {
                ticketPrice = 12;
            } else if ("Weekend".equals(dayType)) {
                ticketPrice = 15;
            } else {
                ticketPrice = 5;
            }
        } else if (age <= 64) {
            if ("Weekday".equals(dayType)) {
                ticketPrice = 18;
            } else if ("Weekend".equals(dayType)) {
                ticketPrice = 20;
            } else {
                ticketPrice = 12;
            }
        } else {
            if ("Weekday".equals(dayType)) {
                ticketPrice = 12;
            } else if ("Weekend".equals(dayType)) {
                ticketPrice = 15;
            } else {
                ticketPrice = 10;
            }
        }

        if (error) {
            System.out.println("Error!\n");
        } else {
            System.out.printf("%d$\n", ticketPrice);
        }

    }
}
