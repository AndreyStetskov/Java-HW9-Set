import java.util.Random;

public class DateGeneration {
    public static String generateOfDate(int age) {
        Random random = new Random();

        int currentYear = 2023;
        int year;
        String createdDate;

        if (age > 18) {
            year = currentYear - age + 18;
        } else {
            year = 0;
        }

        int date;
        int month = random.nextInt(12) + 1;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            date = random.nextInt(30) + 1;
        } else if (month == 2 && year % 4 == 0 && year != 100 || year % 400 == 0) {
            date = random.nextInt(29) + 1;
        } else if (month == 2 && year % 4 != 0) {
            date = random.nextInt(28) + 1;
        } else {
            date = random.nextInt(31) + 1;
        }
        return createdDate = String.valueOf(date) + "." + String.valueOf(month) + "." + String.valueOf(year);
    }
}
