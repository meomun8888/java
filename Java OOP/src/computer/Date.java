package computer;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this.day = 11;
        this.month = 12;
        this.year = 2021;
    }
    public Date(int day_,int month_,int year_){
        if (day_ < 0 || day_ > 31){
            System.out.println("Error, Day 1 to 31 !");
        }else {
            this.day = day_;
        }
        if (month_ < 0 || month_ > 12){
            System.out.println("Error, Month 1 to 12 !");
        }else {
            this.month = month_;
        }
        if (year_ < 2018){
            System.out.println("Error, Year > 2018!");
        }else {
            this.year = year_;
        }
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
       return this.day +"/"+this.month+"/"+this.year;
    }
}

