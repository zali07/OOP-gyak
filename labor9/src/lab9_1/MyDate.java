package lab9_1;

public class MyDate {
    private int year, month, day;
    public MyDate(int year, int month, int day) {
        if(DateUtil.isValidDate(year,month,day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return "Mydate: "+this.year +"-"+this.month+"-"+this.day;
    }

    public int compareTo(MyDate m1){
        if (this.year == m1.year){
            if (this.month == m1.month){
                return this.day - m1.day;
            }
            return this.month - m1.month;
        }
        return this.year - m1.year;
    }
}
