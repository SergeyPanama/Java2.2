public class Main {

    public static void main(String[] args) {
        //вводные данные
        int balance = 500;
        int amount = 2000;
        boolean payment = true;

        //логика
        int percent;
        if (payment) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = amount * percent / 100;

        if (bonus < 11) {
            bonus = 0;
        }
        int balance2 = balance + amount + bonus;
        System.out.println("Бонус за пополнение: " + bonus);
        System.out.println("Итоговый баланс: " + balance2);
    }
}
