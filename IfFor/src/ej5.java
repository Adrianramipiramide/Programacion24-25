import java.util.Scanner;

/*
Escribe un programa que solicite un carácter por teclado e informe de si es alfanumérico (letra o dígito) o no.
 En caso de ser alfanumérico deberá indicar si es una letra o un dígito.
 En caso de ser una letra deberá informar de si es minúscula o mayúscula.
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter");
        char caracter = sc.next().charAt(0);
        if(caracter>=49 && caracter<=57){
            System.out.println(caracter+" es un caracter numérico");
        } else if (caracter>=65 && caracter<=90) {
            System.out.println(caracter + " Es un caracter en mayúsculas");
        } else if (caracter>=97 && caracter<=122) {
            System.out.println(caracter+" Es un caracter en minúsculas");
        }else {
            System.out.println("Introduzca un valor correcto");
        }
    }
}
