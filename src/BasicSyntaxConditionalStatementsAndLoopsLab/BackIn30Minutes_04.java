package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int openingTimeInMin = hour * 60 + min + 30;
        int openingHour = openingTimeInMin / 60;
        int openingMin = openingTimeInMin % 60;

        if (openingHour == 24){
            openingHour = 0;
        }

        System.out.printf("%d:%02d\n", openingHour, openingMin);

    }
}
