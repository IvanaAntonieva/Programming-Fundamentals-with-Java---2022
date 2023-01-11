import java.util.Scanner;

public class PadawanEquipment_10Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double studentsCount = Double.parseDouble(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double sabersCount = Math.ceil(studentsCount + 0.1 * studentsCount);
        double sabersCost = sabersCount * lightsabersPrice;
        double robesCost = studentsCount * robesPrice;
        double beltsCount = Math.ceil(studentsCount - studentsCount / 6);
        double beltsCost = beltsCount * beltsPrice;

        double expenses = sabersCost + robesCost + beltsCost;
        double moneyMore = expenses - money;

        if (expenses <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", expenses);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", moneyMore);
        }
    }
}
