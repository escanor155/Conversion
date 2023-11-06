/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversioncalculation;

/**
 *
 * @author zagar
 */
public class Temperature {
    private double fahrenheit;
    private double celsius;
    private double kelvin;

    public Temperature(double fahrenheit, double celsius, double kelvin) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
        this.kelvin = kelvin;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    public void ConvertCelsius(double number){
        System.out.println("Fahrenheit: "+ number* 1.8 + 32 );
        System.out.println("Kelvin: "+ number + 273.15);

    }
    public void ConvertFahrenheit(double number){
        System.out.println("Celsius: "+ (number - 32) / 1.8);
        System.out.println("Kelvin: "+ (number - 32) / 1.8 + 273.15);
    }
    public void ConvertKelvin(double number){
        System.out.println("Celsius: "+ (number - 273.15));
        System.out.println("Fahrenheit: "+ (number - 273.15) * 1.8 + 32);
    }
    
}
