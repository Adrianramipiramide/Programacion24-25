import java.util.Scanner;

/*
Escribe un programa que solicite la longitud y anchura en metros de una habitación
(con decimales) e imprima su superficie con cuatro decimales.
 */
public class ej5 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Dime la longitud de la habitación");
        double longitud = sc.nextDouble();

        System.out.println("Dime la anchura de la habitación");
        double anchura = sc.nextDouble();

        double superficie = anchura*longitud;

        System.out.printf("La superficie %.4f", superficie);
    }
}
