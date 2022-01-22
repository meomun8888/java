package myenum;

public class Date {
    private Day day;
    private Month month;

    public Date(Day day, Month month) {
        this.day = day;
        this.month = month;
    }

    public Day getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                '}';
    }
}
