package labor2_3;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean validDate(int year, int month, int day){
        return true;
    }
}
