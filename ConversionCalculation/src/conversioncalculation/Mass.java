
package conversioncalculation;

public class Mass {
    private double milligram;
    private double centigram;
    private double kilogram;
    private double gram;
    private double pound;
    private double ounce;
    private double ton;

    public Mass(double milligram, double centigram, double gram, double kilogram, double pound, double ounce,
            double ton) {
        this.milligram = milligram;
        this.centigram = centigram;
        this.kilogram = kilogram;
        this.gram = gram;
        this.pound = pound;
        this.ounce = ounce;
        this.ton = ton;

    }

    public double getMilligram() {
        return milligram;
    }

    public double getCentigram() {
        return centigram;
    }

    public double getKilogram() {
        return kilogram;
    }

    public double getGram() {
        return gram;
    }

    public double getPound() {
        return pound;
    }

    public double getOunce() {
        return ounce;
    }

    public double getTon() {
        return ton;
    }

    public void setMilligram(double milligram) {
        this.milligram = milligram;
    }

    public void setCentigram(double centigram) {
        this.centigram = centigram;
    }

    public void setKilogram(double kilogram) {
        this.kilogram = kilogram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setPound(double pound) {
        this.pound = pound;
    }

    public void setOunce(double ounce) {
        this.ounce = ounce;
    }

    public void setTon(double ton) {
        this.ton = ton;
    }

    public void ConvertMilligram(double number) {
        // assuming the number is in milligram
        System.out.println("Convert into Centigram    :   " + number / 10);
        System.out.println("Convert into Gram         :   " + number / 1000);
        System.out.println("Convert into Kilogram     :   " + number / 1000000);
        System.out.println("Convert into Pound        :   " + number / 453592.37);
        System.out.println("Convert into Ounce        :   " + number / 28350);
        System.out.println("Convert into Ton          :   " + number / 1000000000);
    }

    public void ConvertCentigram(double number) {
        // assuming the number is in centigram
        System.out.println("Convert into Milligram    :   " + number * 10);
        System.out.println("Convert into Gram         :   " + number / 100);
        System.out.println("Convert into Kilogram     :   " + number / 100000);
        System.out.println("Convert into Pound        :   " + number / 45359.24);
        System.out.println("Convert into Ounce        :   " + number / 28350);
        System.out.println("Convert into Ton          :   " + number / 1000000000);
    }

    public void ConvertGram(double number) {
        // assuming the number is in gram
        System.out.println("Convert into Milligram    :   " + number * 1000);
        System.out.println("Convert into Centigram    :   " + number * 100);
        System.out.println("Convert into Kilogram     :   " + number / 1000);
        System.out.println("Convert into Pound        :   " + number / 453.592);
        System.out.println("Convert into Ounce        :   " + number / 28350);
        System.out.println("Convert into Ton          :   " + number / 1000000000);
    }

    public void ConvertKilogram(double number) {
        // assuming the number is in kilogram
        System.out.println("Convert into Milligram    :   " + number * 1000000);
        System.out.println("Convert into Centigram    :   " + number * 100000);
        System.out.println("Convert into Gram         :   " + number * 1000);
        System.out.println("Convert into Pound        :   " + number / 0.45359);
        System.out.println("Convert into Ounce        :   " + number / 35.274);
        System.out.println("Convert into Ton          :   " + number / 1000);
    }

    public void ConvertPound(double number) {
        // assuming the number is in pound
        System.out.println("Convert into Milligram    :   " + number * 453592.37);
        System.out.println("Convert into Centigram    :   " + number * 45359.24);
        System.out.println("Convert into Gram         :   " + number * 453.592);
        System.out.println("Convert into Kilogram     :   " + number / 0.45359);
        System.out.println("Convert into Ounce        :   " + number / 16);
        System.out.println("Convert into Ton          :   " + number / 2240);
    }
    public void ConvertOunce(double number) {
        // assuming the number is in ounce
        System.out.println("Convert into Milligram    :   " + number * 28350);
        System.out.println("Convert into Centigram    :   " + number * 2835);
        System.out.println("Convert into Gram         :   " + number * 28.35);
        System.out.println("Convert into Kilogram     :   " + number / 35.274);
        System.out.println("Convert into Pound        :   " + number / 16);
        System.out.println("Convert into Ton          :   " + number / 35274);
    }
    public void ConvertTon(double number) {
        // assuming the number is in ton
        System.out.println("Convert into Milligram    :   " + number * 1000000000);
        System.out.println("Convert into Centigram    :   " + number * 100000000);
        System.out.println("Convert into Gram         :   " + number * 1000000);
        System.out.println("Convert into Kilogram     :   " + number * 1000);
        System.out.println("Convert into Pound        :   " + number * 2240);
        System.out.println("Convert into Ounce        :   " + number * 35274);
    }

}
