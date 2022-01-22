package student;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            if (month < 0 || month > 12) {
                this.month = 0;
            } else if (month == 2) {
                if (day < 0 || day > 28) {
                    System.out.println("Day Error !");
                } else {
                    this.month = month;
                    this.day = day;
                }
            } else {
                this.month = month;
            }
            if (day < 0 || day > 31) {
                this.day = day;
            } else {
                this.day = day;
            }
            this.year = year;
        } else {
            if (day < 0 || day > 31) {
                this.day = 0;
            } else {
                this.day = day;
            }
            if (month < 0 || month > 12) {
                this.month = 0;
            } else if (month == 2){
                if (day < 0 || day > 29){
                    System.out.println("Day Error !");
                }else {
                    this.month = month;
                    this.day = day;
                }
            }else {
                this.month = month;
            }
            this.year = year;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year+".";
    }
}
