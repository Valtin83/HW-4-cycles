public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        // от 1 до 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " ");
        }

        System.out.println("Задача №2");
        // от 10 до 1
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " ");
        }

        System.out.println("Задача №3");
        // все чётные числа от 0 до 17
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i + " ");
        }

        System.out.println("Задача №4");
        // от 10 до -10
        for (int i = 10; i > -11; i--) {
            System.out.println(i + " ");
        }

        System.out.println("Задача №5");
        // високосный год с 1904 по 2096
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Задача №6");
        // последовательность чисел от 7 до 98, i = i + 7, 98 + 7
        for (int i = 7; i < 105; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача №7");
        // последовательность чисел от 1 до 512, i = i * 2, 512 * 2
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача №8");
        // годовое накопление в "банку"
        int contribution = 29000;
        int sum = 0;
        for (int i = 1; i < 13; i++) {
            sum = sum + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей». ");
        }

        System.out.println("Задача №9");
        // годовой вклад под проценты — 12% годовых
        // 1% от суммы каждый месяц
        int contribution2 = 29000;
        int sum2 = 0;
        for (int i = 1; i < 13; i++) {
            sum2 = sum2 + contribution2 / 100;
            sum2 = sum2 + contribution2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum2 + " рублей». ");
        }

        System.out.println("Задача №10");
        // таблица умножения на 2
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }


    }

}