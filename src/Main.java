public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        // сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        int totalSum = 0; // сумма итогового накопления
        int i = 0; // месяцы
        int contribution = 15_000; // ежемесячный вклад
        while (totalSum < 2_459_000) {
            i++;
            totalSum = totalSum + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " +
                    totalSum + " рублей");
        }

        System.out.println("Задача №2");
        // числа от 1 до 10 одной строкой через пробел
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");

        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");

        }
        System.out.println();

        System.out.println("Задача №3");
        //
    }
}
