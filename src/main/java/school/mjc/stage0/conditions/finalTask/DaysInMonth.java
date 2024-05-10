package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            switch (month) {
                case 1, 3, 5, 7, 9, 11:
                    System.out.println(31);
                    break;
                case 12, 4, 6, 8, 10:
                    System.out.println(30);
                    break;
                case 2:
                    if (isLeap) System.out.println(29);
                    else System.out.println(28);
                    break;
            }
        }
    }
}
