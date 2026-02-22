//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\nHomework 7");

        System.out.println("\nЗадача 1");

        int firstFriday = 5;

        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("\nЗадача 2.1");

        int distance = 42195;
        int step = 500;
        int distanceCompleted = 0;

        do {
            int remaining = distance - distanceCompleted;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
            distanceCompleted += step;
        } while (distanceCompleted <= distance);

        System.out.println("\nЗадача 2.2");

        int fullDistance = 42195;
        int segment = 500;

        for (int distCompleted = 0; distCompleted <= distance; distCompleted += segment) {
            int remaining = fullDistance - distCompleted;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
       }

        System.out.println("\nЗадача 3.1");

        int budget = 5000;
        int day = 1;
        int payDays = 0;

        while (budget >= 100) {
            if (day % 5 == 0) {System.out.println("День " + day + ": бесплатный (5-й день)");
                day++;
                continue;
            }
            budget -= 100;
            payDays++;
            System.out.println("День " + day + ": оплачено 100 ₽, остаток: " + budget + " р.");
            day++;
        }
        System.out.println("\nБюджета хватит на указанное количество дней: " + (day - 1));

        System.out.println("\nЗадача 3.2");

        int parkingBudget = 2000;
        int days = 1;
        int totalDays = 0;

        for (; parkingBudget >= 100; days++) {
            if (days % 5 == 0) {
                System.out.println("День " + days + ": бесплатный (5-й день)");
                totalDays++;
                continue;
            }
            parkingBudget -= 100;
            totalDays++;
            System.out.println("День " + days + ": оплачено 100 ₽, остаток: " + parkingBudget + " р.");
        }
        System.out.println("\nБюджета хватит на указанное количество дней: " + totalDays);

        System.out.println("\nЗадача 4");

        int month = 0;
        double total = 0.0;

        while (true) {
            month++;
            total += 15000.0;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Месяц " + month + ": " +
                    String.format("%,.0f", total) + " р.");
            if (total >= 12000000.0) {
                break;
            }
        }

        System.out.println("\nЗадача 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats < 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев на " + minute + " минуте. Зарядка прервана на 2 минуты.");
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена досрочно. Текущий заряд: " + charge + "%");
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
            if (charge >= 100) {
                charge = 100;
                System.out.println("Зарядка завершена. Текущий заряд: " + charge + "%");
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут.");

        System.out.println("\nЗадача 6");
    }
}