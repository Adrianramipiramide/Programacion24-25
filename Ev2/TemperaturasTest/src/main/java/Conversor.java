/*
Desarrolla una clase "ConvertidorTemperatura" con un método que convierta grados Celsius a Fahrenheit y viceversa.
Crea  pruebas unitarias para asegurarte de que la conversión se realiza correctamente para al menos dos valores diferentes.

 */
public class Conversor {

    public static void main(String[] args) {
        farenheitCelsius(85);
        celsiusFarnheit(0);
    }
    public static double celsiusFarnheit(double celsius) {
        double farnheit = (celsius*9/5) + 32;
        System.out.println(farnheit);
        return farnheit;
    }

    public static double farenheitCelsius(double farenheit) {
        double celsius = (farenheit - 32)*5/9;
        System.out.println(celsius);
        return celsius;
    }
}
