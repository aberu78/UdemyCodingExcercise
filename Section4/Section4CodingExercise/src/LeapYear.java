public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isLeap = true;
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
