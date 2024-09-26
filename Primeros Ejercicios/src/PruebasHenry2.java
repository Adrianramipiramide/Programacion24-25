import java.util.Scanner;

/*
 * Realiza un programa que pida una hora por teclado
 * y que muestre luego buenos días, buenas tardes o
 * buenas noches según la hora. Se utilizarán los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente.
 * Sólo se tiene en cuenta las horas, los minutos no se
 * deben introducir por teclado. Además, si la hora introducida
 * es distinta del rango 0-23 se indicará por pantalla que no es correcta.
 */
public class PruebasHenry2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una hora");
        int hora = sc.nextInt();

        if (hora > 23 || hora < 0) {
            System.out.println("El valor no es correcto");
        } else if (hora <= 6 || hora >= 21) {
            System.out.println("Buenas noches");
        } else if (hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora <= 21) {
            System.out.println("Buenas tardes");
        }
    }
}
