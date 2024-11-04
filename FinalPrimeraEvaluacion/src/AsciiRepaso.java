import java.util.Scanner;

/*
Escribe un programa que lea del teclado una letra e imprima su carácter ASCII así como los tres siguientes caracteres:

Introduce un carácter: E

Código ASCII de E es 69

Los tres siguientes caracteres son: F - G - H
 */
public class AsciiRepaso {
    public static void main(String[] args) {
        char caracter = 'a';
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
             caracter = palabra.charAt(i);
            System.out.println((int)caracter);
        }
    }
}
