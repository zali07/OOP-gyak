package labor2_3;

public class MyDate {
    private int year, month, day;
    public MyDate(int year, int month, int day) {
        if(DateUtil.validDate(year,month,day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public String toString() {
        return "Mydate: "+this.year +"-"+this.month+"-"+this.day;
    }
}
