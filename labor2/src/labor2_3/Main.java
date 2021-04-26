package labor2_3;

public class Main {
    public static void main(String[] args){

        System.out.println(DateUtil.leapYear(1900));
        System.out.println(DateUtil.leapYear(2000));
        System.out.println(DateUtil.leapYear(2004));

        MyDate date1 = new MyDate(2021,2,22);
        System.out.println(date1);
    }


}
