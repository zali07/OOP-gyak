package lab9_1;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day){
        return true;
    }
}
