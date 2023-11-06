
package conversioncalculation;

import java.util.Scanner;


public class ConversionCalculation {
    public static void main(String[] args) {
        Length length = new Length(0, 0, 0, 0, 0, 0, 0, 0);
        Mass mass = new Mass(0, 0, 0, 0, 0, 0, 0);
        Temperature temperature = new Temperature(0, 0, 0);
        Time time = new Time(0, 0, 0, 0, 0, 0);
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE CHOOSE THE UNIT TO BE CONVERTED");
        System.out.println();
        System.out.println("[1] Length");
        System.out.println("[2] Mass");
        System.out.println("[3] Temperature");
        System.out.println("[4] Time");
        System.out.print("      >>>   :  ");
        int unit = scan.nextInt();

        // number to be converted
        System.out.print("ENTER NUMBER TO BE CONVERTED:   ");
        double number = scan.nextDouble();
        length.setCentimeter(number);

        switch (unit) {
            case 1:
                System.out.println("[1] Millimeter");
                System.out.println("[2] Centimeter");
                System.out.println("[3] Meter");
                System.out.println("[4] Kilometer");
                System.out.println("[5] Inch");
                System.out.println("[6] Feet");
                System.out.println("[7] Yard");
                System.out.println("[8] Mile");
                System.out.print("      >>>   :  ");
                int convertLength = scan.nextInt();
                switch (convertLength) {
                    case 1:
                        length.ConvertMillimeter(number);
                        break;
                    case 2:
                        length.ConvertCentimeter(number);
                        break;
                    case 3:
                        length.ConvertMeter(number);
                        break;
                    case 4:
                        length.ConvertKilometer(number);
                        break;
                    case 5:
                        length.ConvertInch(number);
                        break;
                    case 6:
                        length.ConvertFeet(number);
                        break;
                    case 7:
                        length.ConvertYard(number);
                        break;
                    case 8:
                        length.ConvertMile(number);
                        break;
                }
                break;
            case 2:
                System.out.println("[1] Millimeter");
                System.out.println("[2] Centimeter");
                System.out.println("[3] Gram");
                System.out.println("[4] Kilogram");
                System.out.println("[5] Pound");
                System.out.println("[6] Ounce");
                System.out.println("[7] Ton");
                System.out.print("      >>>   :  ");
                int convertMass = scan.nextInt();
                switch (convertMass) {
                    case 1:
                        mass.ConvertMilligram(number);
                        break;
                    case 2:
                        mass.ConvertCentigram(number);
                        break;
                    case 3:
                        mass.ConvertGram(number);
                        break;
                    case 4:
                        mass.ConvertKilogram(number);
                        break;
                    case 5:
                        mass.ConvertPound(number);
                        break;
                    case 6:
                        mass.ConvertOunce(number);
                        break;
                    case 7:
                        mass.ConvertTon(number);
                        break;
                }
                break;
            case 3:
                System.out.println("[1] Celsius");
                System.out.println("[2] Fahrenheit");
                System.out.println("[3] Kelvin");
                System.out.print("      >>>   :  ");
                int convertTemperature = scan.nextInt();
                switch (convertTemperature) {
                    case 1:
                        temperature.ConvertCelsius(number);
                        break;
                    case 2:
                        temperature.ConvertFahrenheit(number);
                        break;
                    case 3:
                        temperature.ConvertKelvin(number);
                        break;
                }
                break;
            case 4:
                System.out.println("[1] Millisecond");
                System.out.println("[2] Second");
                System.out.println("[3] Minute");
                System.out.println("[4] Hour");
                System.out.println("[5] Day");
                System.out.println("[6] Week");
                System.out.print("      >>>   :  ");
                int convertTime = scan.nextInt();
                switch (convertTime) {
                    case 1:
                        time.ConvertMillisecond(number);
                        break;
                    case 2:
                        time.ConvertSecond(number);
                        break;
                    case 3:
                        time.ConvertMinute(number);
                        break;
                    case 4:
                        time.ConvertHour(number);
                        break;
                    case 5:
                        time.ConvertDay(number);
                        break;
                    case 6:
                        time.ConvertWeek(number);
                        break;
                }
                break;
        }
        scan.close();
    }

}
