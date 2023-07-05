public class Main {
    public static void main(String[] args) {
        int score = 100;//счет клиента
        int depositAccount = 1100; //-пополнение.

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;//формула подсчета бонуса
        } else {
            bonus = 0;
        }
        int balance = score + depositAccount + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}