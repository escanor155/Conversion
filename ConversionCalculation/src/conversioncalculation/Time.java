
package conversioncalculation;

public class Time {
    private double millisecond;
    private double second;
    private double minute;
    private double hour;
    private double day;
    private double week;

    public Time(double millisecond, double second, double minute, double hour, double day, double week) {
        this.millisecond = millisecond;
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.week = week;

    }

    // setters
    public void setMillisecond(double millisecond) {
        this.millisecond = millisecond;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setMinute(double minute) {
        this.minute = minute;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public void setWeek(double week) {
        this.week = week;
    }

    // getters
    public double getMillisecond() {
        return millisecond;
    }

    public double getSecond() {
        return second;
    }

    public double getMinute() {
        return minute;
    }

    public double getHour() {
        return hour;
    }

    public double getDay() {
        return day;
    }

    public double getWeek() {
        return week;
    }

    public void ConvertMillisecond(double number){
        System.out.println("Second  : "+ number/1000);
        System.out.println("Minute  : "+ number/60000);
        System.out.println("Hour    : "+ number/3600000);
        System.out.println("Day     : "+ number/86400000);
        System.out.println("Week    : "+ number/604800000);
    }
    public void ConvertSecond(double number){
        System.out.println("Millisecond : "+ number*1000);
        System.out.println("Minute      : "+ number/60);
        System.out.println("Hour        : "+ number/3600);
        System.out.println("Day         : "+ number/86400);
        System.out.println("Week        : "+ number/604800);
    }
    public void ConvertMinute(double number){
        System.out.println("Millisecond : "+ number*60000);
        System.out.println("Second      : "+ number*60);
        System.out.println("Hour        : "+ number/60);
        System.out.println("Day         : "+ number/1440);
        System.out.println("Week        : "+ number/10080);
    }
    public void ConvertHour(double number){
        System.out.println("Millisecond : "+ number*3600000);
        System.out.println("Second      : "+ number*3600);
        System.out.println("Minute      : "+ number*60);
        System.out.println("Day         : "+ number/24);
        System.out.println("Week        : "+ number/168);
    }
    public void ConvertDay(double number){
        System.out.println("Millisecond : "+ number*86400000);
        System.out.println("Second      : "+ number*86400);
        System.out.println("Minute      : "+ number*1440);
        System.out.println("Hour        : "+ number*24);
        System.out.println("Week        : "+ number/7);
    }
    public void ConvertWeek(double number){
        System.out.println("Millisecond : "+ number*604800000);
        System.out.println("Second      : "+ number*604800);
        System.out.println("Minute      : "+ number*10080);
        System.out.println("Hour        : "+ number*168);
        System.out.println("Day         : "+ number*7);
    }
    
}
