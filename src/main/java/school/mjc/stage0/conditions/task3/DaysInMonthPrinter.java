package school.mjc.stage0.conditions.task3;

import java.util.List;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        List<Integer> monthsWith31Days = List.of(1,3,5,7,8,10,12);
        if (month > 12 || month < 1) System.out.println("wrong number!");
        else if (month == 2) System.out.println(28);
        else if (monthsWith31Days.contains(month)) System.out.println(31);
        else System.out.println(30);
    }
}
