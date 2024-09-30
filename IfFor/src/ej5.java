import java.util.Scanner;

/*
Escribe un programa que solicite un carácter por teclado e informe de si es alfanumérico (letra o dígito) o no.
 En caso de ser alfanumérico deberá indicar si es una letra o un dígito.
 En caso de ser una letra deberá informar de si es minúscula o mayúscula.
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char caracter = sc.next().charAt(0);
        if(caracter>0 && caracter<10){
            System.out.println(caracter+" es un caracter numérico");
        }
    }

}
