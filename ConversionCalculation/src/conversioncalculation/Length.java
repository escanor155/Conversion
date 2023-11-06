
package conversioncalculation;

public class Length {
    // this will be a calculator for conveting length like, cm, m, km, mm, ans so
    // forth
    private double millimeter = 0;
    private double centimeter = 0;
    private double meter = 0;
    private double kilometer = 0;
    private double inch = 0;
    private double feet = 0;
    private double yard = 0;
    private double mile = 0;

    public Length(double centimeter, double meter, double kilometer, double millimeter, double inch, double feet, double yard, double mile ) {
        this.centimeter = centimeter;
        this.meter = meter;
        this.kilometer = kilometer;
        this.millimeter = millimeter;
        this.inch = inch;
        this.feet = feet;
        this.yard = yard;
        this.mile = mile;
    }

    public double getCentimeter() {
        return centimeter;
    }

    public double getMeter() {
        return meter;
    }

    public double getKilometer() {
        return kilometer;
    }

    public double getMillimeter() {
        return millimeter;
    }

    public double getInch() {
        return inch;
    }

    public double getFeet() {
        return feet;
    }

    public double getYard() {
        return yard;
    }

    public double getMile() {
        return mile;
    }

    public void setCentimeter(double centimeter) {
        this.centimeter = centimeter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setKilometer(double kilometer) {
        this.kilometer = kilometer;
    }

    public void setMillimeter(double millimeter) {
        this.millimeter = millimeter;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public void setYard(double yard) {
        this.yard = yard;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }

    public void ConvertCentimeter(double number) {
        // assuming the number is in centimeter
        System.out.println("Convert into Millimeters   :   " + number * 10);
        System.out.println("Convert into Meters        :   " + number / 100);
        System.out.println("Convert into Kilometers    :   " + number / 100000);
        System.out.println("Convert into Inchs         :   " + number / 2.54);
        System.out.println("Convert into Feets         :   " + number / 30.48);
        System.out.println("Convert into Yards         :   " + number / 91.44);
        System.out.println("Convert into Miles         :   " + number / 160934);
    }

    public void ConvertMillimeter(double number) {
        // assuming the number is in millimeter
        System.out.println("Convert into Centimeters   :   " + number / 10);
        System.out.println("Convert into Meters        :   " + number / 1000);
        System.out.println("Convert into Kilometers    :   " + number / 1000000);
        System.out.println("Convert into Inchs         :   " + number / 25.4);
        System.out.println("Convert into Feets         :   " + number / 304.8);
        System.out.println("Convert into Yards         :   " + number / 914.4);
        System.out.println("Convert into Miles         :   " + number / 1609344);
    }

    public void ConvertMeter(double number) {
        // assuming the number is in meter
        System.out.println("Convert into Millimeters   :   " + number * 1000);
        System.out.println("Convert into Centimeters   :   " + number * 100);
        System.out.println("Convert into Kilometers    :   " + number / 1000);
        System.out.println("Convert into Inchs         :   " + number * 39.37);
        System.out.println("Convert into Feets         :   " + number * 3.281);
        System.out.println("Convert into Yards         :   " + number * 1.094);
        System.out.println("Convert into Miles         :   " + number / 1609);

    }

    public void ConvertKilometer(double number) {
        // assuming the number is in kilometer
        System.out.println("Convert into Millimeters   :   " + number * 1000000);
        System.out.println("Convert into Centimeters   :   " + number * 100000);
        System.out.println("Convert into Meters        :   " + number * 1000);
        System.out.println("Convert into Inchs         :   " + number * 39370);
        System.out.println("Convert into Feets         :   " + number * 3281);
        System.out.println("Convert into Yards         :   " + number * 1094);
        System.out.println("Convert into Miles         :   " + number);
    }

    public void ConvertInch(double number) {
        // assuming the number is in inch
        System.out.println("Convert into Millimeters   :   " + number * 25.4);
        System.out.println("Convert into Centimeters   :   " + number * 2.54);
        System.out.println("Convert into Meters        :   " + number / 39.37);
        System.out.println("Convert into Kilometers    :   " + number / 39370);
        System.out.println("Convert into Feets         :   " + number / 12);
        System.out.println("Convert into Yards         :   " + number / 36);
        System.out.println("Convert into Miles         :   " + number / 63360);
    }

    public void ConvertFeet(double number) {
        // assuming the number is in feet
        System.out.println("Convert into Millimeters   :   " + number * 304.8);
        System.out.println("Convert into Centimeters   :   " + number * 30.48);
        System.out.println("Convert into Meters        :   " + number / 3.281);
        System.out.println("Convert into Kilometers    :   " + number / 3281);
        System.out.println("Convert into Inchs         :   " + number * 12);
        System.out.println("Convert into Yards         :   " + number / 3);
        System.out.println("Convert into Miles         :   " + number / 5280);
    }

    public void ConvertYard(double number) {
        // assuming the number is in yard
        System.out.println("Convert into Millimeters   :   " + number * 9144);
        System.out.println("Convert into Centimeters   :   " + number * 91.44);
        System.out.println("Convert into Meters        :   " + number / 1.094);
        System.out.println("Convert into Kilometers    :   " + number / 1094);
        System.out.println("Convert into Inchs         :   " + number * 36);
        System.out.println("Convert into Feets         :   " + number * 3);
        System.out.println("Convert into Miles         :   " + number / 1760);
    }

    public void ConvertMile(double number) {
        // assuming the number is in mile
        System.out.println("Convert into Millimeters   :   " + number * 1609344);
        System.out.println("Convert into Centimeters   :   " + number * 160934);
        System.out.println("Convert into Meters        :   " + number * 1609);
        System.out.println("Convert into Kilometers    :   " + number * 1.609);
        System.out.println("Convert into Inchs         :   " + number * 63360);
        System.out.println("Convert into Feets         :   " + number * 5280);
        System.out.println("Convert into Yards         :   " + number * 1760);
    }

}
