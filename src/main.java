public class main {
    public static void main(String[] args) {
        int balans = 150;
        int pay = 1_000;
        int bonus;
        int sum = balans + pay;

        if (pay >= 1_000) {
            bonus = pay/100;
        }
        else {
            bonus = 0;
        }
        int abonentBalans = balans + pay + bonus;

        System.out.println("Баланс: " + abonentBalans);
        System.out.println("Бонус: " + bonus);

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.





    }
}
