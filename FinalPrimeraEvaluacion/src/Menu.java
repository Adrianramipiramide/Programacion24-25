import java.util.InputMismatchException;
import java.util.Scanner;

/*
Descripción: Crea un programa en Java que presente un menú con varias opciones:

Opción 1: Sumar dos números.
Opción 2: Restar dos números.
Opción 3: Multiplicar dos números.
Opción 4: Salir del programa.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        int resultado;
        int opcion = 0;


        try {
            do {
                System.out.println("\nElige la operacion que quiera realizar");
                System.out.println("1. Sumar");
                System.out.println("2. Multiplicar");
                System.out.println("3. Dividir");
                System.out.println("4. Restar");
                System.out.println("5. Salir");

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        resultado = num + num;
                        System.out.println("El resultado de la operacion es: " + resultado);
                        break;

                    case 2:
                        resultado = num * num;
                        System.out.println("El resultado de la operacion es: " + resultado);
                        break;

                    case 3:
                        resultado = num / num;
                        System.out.println("El resultado de la operacion es: " + resultado);
                        break;

                    case 4:
                        resultado = num - num;
                        System.out.println("El resultado de la operacion es: " + resultado);
                        break;

                    case 5:
                        System.out.println("Va a salir de la pantalla actual");


                    default:
                        System.out.println("Opcion no valida, ingrese un número entre el 1 y el 5");

                }

            } while (opcion != 5);

        } catch (InputMismatchException e) {
            System.out.println("Ha ocurrido un error con lo que ha introducido");
        }
    }
}
