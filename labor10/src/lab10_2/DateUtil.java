package lab10_2;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean validDate(int year, int month, int day){

        if(year <= 0 || month <= 0 || day <= 0){
            return false;
        }
        if(month == 2){
            if(day <= 28){
                return true;
            }
            return day == 29 && leapYear(year);
        }
        if((month < 8 && (month % 2 == 1)) || (month > 7 && (month % 2 == 0))){
            return day <= 31;
        }
        return day <= 30;
    }
}
