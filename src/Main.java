public class Main {
    public static void main(String[] args) {
        int initialBalance = 500;
        int accountReplenishment = 1400;
        int bonus = 0;

        if (accountReplenishment > 1000) {
            bonus = (accountReplenishment / 100);
        }

        int balance = initialBalance + accountReplenishment + bonus;

        System.out.println("Сумма баланса: " + balance);
        System.out.println("Начислено бонусов: " + bonus);


    }
}