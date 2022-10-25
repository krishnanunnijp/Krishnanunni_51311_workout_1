import java.util.Scanner;

public class Fahren {
    private Scanner sc = new Scanner(System.in);
    private double VALUE;
    private double celsiusValue;

    Fahren() {
        this.VALUE = 0;
    }

    public void Measure() {
        System.out.println("Measure the temperature in fahrenheit:");
        this.VALUE = sc.nextDouble();
        toCelsius();
    }

    private void toCelsius() {
        this.celsiusValue= (this.VALUE - 32) * 5 / 9;
    }
    public double getCelsius(){
        return (this.celsiusValue);
    }



}
