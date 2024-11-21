import java.util.Scanner;

/*
Escribe un programa que lea del teclado una letra e imprima su carácter ASCII así como los tres siguientes caracteres:

Introduce un carácter: E

Código ASCII de E es 69

Los tres siguientes caracteres son: F - G - H
 */
public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter = sc.next().charAt(0);

        System.out.println(caracter + caracter++ + (int)caracter);

    }
}
