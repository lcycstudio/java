public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int year = (int) (minutes / 525600);
            int day = (int) (minutes / 1440);
            if (year > 0) {
                int yearRemain = (int) (minutes % 525600);
                day = yearRemain / 1440;
            }
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }
}
