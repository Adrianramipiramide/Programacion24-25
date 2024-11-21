import java.util.Scanner;

/*
Escribe un programa que lea una cantidad entera en euros y realice el desglose en billetes priorizando los más grandes. Ejemplo de ejecución:
Introduce la cantidad: 3456

Billetes de 500 euros: 6

Billetes de 200 euros: 2

Billetes de 100 euros: 0

Billetes de 50 euros: 1

Billetes de 20 euros: 0

Billetes de 10 euros: 0

Billetes de 5 euros: 1

Euros en monedas: 1
 */
public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de €");

        int cantidadTotal = sc.nextInt();
        int billetes500 = cantidadTotal / 500;
        int billetes200 = (cantidadTotal % 500) / 200;
        int billetes100 = (cantidadTotal - billetes500 * 500 - billetes200 * 200) / 100;
        int billetes50 = (cantidadTotal - billetes500 * 500 - billetes200 * 200 - billetes100 * 100) / 50;
        int billetes20 = (cantidadTotal - billetes500 * 500 - billetes200 * 200 - billetes100 * 100 - billetes50 * 50) / 20;
        int billetes10 = (cantidadTotal - billetes500 * 500 - billetes200 * 200 - billetes100 * 100 - billetes50 * 50 - billetes20 * 20) / 10;
        int billetes5 = (cantidadTotal - billetes500 * 500 - billetes200 * 200 - billetes100 * 100 - billetes50 * 50 - billetes20 * 20 - billetes10 * 10) / 5;
        int monedas1 = (cantidadTotal - billetes500 * 500 - billetes200 * 200 - billetes100 * 100 - billetes50 * 50 - billetes20 * 20 - billetes10 * 10 - billetes5 * 5);


        System.out.println("Billetes de 500: " + billetes500);
        System.out.println("Billetes de 200: " + billetes200);
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Monedas de 1: " + monedas1);


    }
}
