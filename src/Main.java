// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var bank = 0;
        var mounth = 0;
        while (bank < 2_459_000) {
            bank = bank + 15000;
            mounth = mounth + 1;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + bank + " рублей");
        }

        System.out.println();
        System.out.println("Задача 2");
        var num = 0;
        var numInv = 10;
        while (num < 10) {
            num = num + 1;
            System.out.print(num + " ");
        }
        System.out.println();
        while (numInv >= 1) {
            System.out.print(numInv + " ");
            numInv = numInv - 1;
        }

        System.out.println();
        System.out.println("Задача 3");
        var countryY = 12_000_000L;
        var bornPeople = 17;
        var deadPeople = 8;
        var yearss = 1;
        while (yearss < 10) {
            yearss = yearss + 1;
            countryY = countryY + countryY * (bornPeople - deadPeople) / 1000;
            System.out.println("Год " + yearss + " численность населения составляет " + countryY + " человек");
        }

        System.out.println();
        System.out.println("Задача 4");
        var inv = 15000L;
        var mounthInv = 0;
        while (inv <= 12_000_000) {
            mounthInv = mounthInv + 1;
            inv = inv + ((inv * 7) / 100);
            System.out.println("Месяц - " + mounthInv + ", накопления - " + inv);
        }

        System.out.println();
        System.out.println("Задача 5");
        var invTwo = 15000L;
        var mounthInvTwo = 0;
        while (invTwo <= 12_000_000) {
            mounthInvTwo = mounthInvTwo + 1;
            invTwo = invTwo + ((invTwo * 7) / 100);
            if (mounthInvTwo % 6 == 0) {
                System.out.println("Месяц - " + mounthInvTwo + ", накопления - " + invTwo);
            }
        }

        System.out.println();
        System.out.println("Задача 6");
        var mounths = 0;
        var invs = 15000L;
        while (mounths <= 9*12) {
            mounths = mounths + 1;
            invs = invs + ((invs * 7) / 100);
            if (mounths % 18 == 0) {
                System.out.println("Месяц - " + mounths + ", накопления - " + invs);}
        }

        System.out.println();
        System.out.println("Задача 7");
        var friday = 3;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;}

        System.out.println();
        System.out.println("Задача 8");
        var year = 79;
        var after = 2023 + 100;
        var before = 2023 - 200;
        while (year <= after) {
            year = year + 79;
            if (year > before && year <= after) {
                System.out.println(year);}
        }
    }
}