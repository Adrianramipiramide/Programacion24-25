import java.util.InputMismatchException;
import java.util.Scanner;

/*
Solicita una int que represente un numero entero
 usar control de excepciones

 */
public class tryCatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esValido = false;


        while (esValido == false) {
            System.out.println("Introduce un número válido");
            try {
                int numeroInt = sc.nextInt();

                    esValido = true;

                System.out.println(numeroInt + " es un numero valido");

            } catch (InputMismatchException e) {
                System.out.println("Error, el numero no es valido");
                e.getMessage();
                break;
            }
        }
    }
}
