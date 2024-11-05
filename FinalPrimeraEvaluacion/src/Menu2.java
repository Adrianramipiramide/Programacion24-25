import java.util.Scanner;

/*
Descripción: Crea un programa en Java que muestre un menú con opciones para convertir unidades de medida.
El programa debe permitir al usuario elegir entre las siguientes opciones:

Opción 1: Convertir de metros a kilómetros.
Opción 2: Convertir de gramos a kilogramos.
Opción 3: Convertir de segundos a minutos.
Opción 4: Salir del programa
 */
public class Menu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("------------------------");
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("------------------------");
            int num=0;

            while (num != 4) {
                System.out.println("Introduzca un numero del 1 al 4 dependiendo de lo que quiera realizar");
                System.out.println("Para convertir el valor de metros a km pulse 1");
                System.out.println("Para convertir el valor de gramos a kg pulse 2");
                System.out.println("Para convertir el valor de segundos a minutos pulse 3");
                System.out.println("Para salir pulse 4");
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Introduce el nº de metros");
                        int valor = sc.nextInt();
                        System.out.println(valor+ " metros son "+ (valor/1000) +" Km");

                    case 2:
                        System.out.println("Introduce el numero de gramos");
                        double valor2 = sc.nextDouble();
                        System.out.println(valor2+ " gramos son "+ (valor2/1000) +" Kg");

                    case 3:
                        System.out.println("Introduce el valor de segundos");
                        double valor3 = sc.nextDouble();
                        System.out.println(valor3 + " segundos son "+ (valor3/60) +" Minutos");

                    case 4:
                        System.out.println("Acaba de salir del programa");
                        break;
                    default:
                        System.out.println("El valor introducido no es correcto");
                }
            }

        } catch (Exception e) {
            System.out.println("Introduce un valor válido");
        }
    }
}
