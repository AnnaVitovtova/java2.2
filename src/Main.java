public class Main {
    public static void main(String[] args) {
        int money = 100;
        int plus = 1100;
        int bonus;
        if (plus > 1000) {
            bonus = plus / 100;
        } else bonus = 0;
        int total = bonus + money + plus;

        System.out.println("бонусные рубли:" + bonus);
        System.out.println("итоговый счет:" + total);


    }
}

