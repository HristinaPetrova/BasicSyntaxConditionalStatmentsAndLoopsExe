package BasicSyntaxConditionalStatementsAndLoopsExe;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double sabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sabersNeededMoney = Math.ceil(studentsNumber * 1.1) * sabersPrice;
        double robesNeededMoney = studentsNumber * robesPrice;
        double beltsNeededMoney = studentsNumber * beltsPrice;

        if (studentsNumber >= 6) {
            int freeBelt = studentsNumber / 6;
            beltsNeededMoney = beltsNeededMoney - (freeBelt * beltsPrice);
        }

        double neededMoney = sabersNeededMoney + robesNeededMoney + beltsNeededMoney;
        double difference = Math.abs(budget - neededMoney);

        if (neededMoney <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.\n", neededMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.\n", difference);
        }

    }
}
