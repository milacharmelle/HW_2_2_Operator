public class main {
    public static void main(String[] args) {
        int balans = 150;
        int pay = 1_000;
        int bonus;
        int sum = balans + pay;

        if (pay >= 1_000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int abonBalans = balans + pay + bonus;

        System.out.println("Баланс: " + abonBalans);
        System.out.println("Бонуc: " + bonus);


    }
}
