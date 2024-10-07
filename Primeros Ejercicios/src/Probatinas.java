import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escribe un programa que pida por teclado una cantidad de segundos
y devuelva su correspondencia a horas, minutos y segundos
 */
public class Probatinas {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cantidad de segundos");

        try {
            int segundosTotales = sc.nextInt();

            int horas = segundosTotales / 3600;

            int minutos = (segundosTotales % 3600) / 60;

            int segundos = (segundosTotales % 60);

            System.out.println(segundosTotales + " segundos son " + horas + " horas " + minutos + " minutos " + segundos + " segundos");

        } catch (InputMismatchException e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
