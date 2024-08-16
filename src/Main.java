public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        // сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
        int accumulation = 2_459_000;
        int totalSum = 0; // сумма итогового накопления
        int month = 0; // месяцы
        int contribution = 15_000; // ежемесячный вклад
        while (totalSum < accumulation) {
            month++;
            totalSum = totalSum + contribution;
            System.out.println("Месяц " + month + "-й, сумма накоплений равна " +
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
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача №3");
        // прирост населения в течении 10 лет
        int population = 12_000_000;
        int birthPerThousand = 17;
        int deathPerThousand = 8;
        for (int i1 = 1; i1 <= 10; i1++) {
            int birthRate = birthPerThousand * population / 1000;
            int deathRate = deathPerThousand * population / 1000;
            population = population + birthRate - deathRate;
            System.out.println("Год " + i1 + "-й, численность населения составляет " +
                    population);
        }

        System.out.println("Задача №4");
        // накопление под 7% ежемесячно
        int sum = 15_000;
        double percent = 7D / 100;
        int finalAmount = 12_000_000;
        month = 0;
        while (sum < finalAmount) {
            sum = (int) (sum * (1 + percent));
            month++;

            System.out.println("Месяц " + month + "-й, сумма накоплений равна " +
                    sum + " рублей");
        }
        System.out.println("Задача №5");
        // вывести в консоль каждый 6-й месяц
        sum = 15_000;
        month = 0;
        while (sum < finalAmount) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + "-й, сумма накоплений равна " +
                        sum + " рублей");
            }
        }
        System.out.println("Задача №6");
        // накопления за 9 лет, с отчётом каждые полгода
        sum = 15_000;
        month = 0;
        int months = 12 * 9; // кол-во месяцев за 9 лет
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + "-й, сумма накоплений равна " +
                        sum + " рублей");
            }
        }

        System.out.println("Задача №7");
        int firstFridayMonth = 2; // первая пятница месяца 2-го числа
        for (int dey = firstFridayMonth; dey <= 31; dey += 7) {
            System.out.println("Сегодня пятница, " + dey +
                    "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача №8");
        // годы пролёта кометы
        int period = 79; // период пролёта кометы
        int currentYear = 2024; // текущий год
        int startedSee = 0; // нулевой год, когда начали видеть комету
        int start = currentYear - 200; // начало рассматриваемого периода
        int end = currentYear + 100; // конец рассматриваемого периода
        for (int year = startedSee; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}