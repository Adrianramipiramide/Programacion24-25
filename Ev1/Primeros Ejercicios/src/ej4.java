import java.util.Scanner;

/*
Escribe un programa que defina la constante PI como 3.1416 que calcule e imprima el
área de un círculo cuyo radio se pide por pantalla. (área del círculo = PI*radio^2).
 */
public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.1416;
        System.out.println("Dime cuanto vale el área");
        double radio = sc.nextInt();
        double area = PI*(Math.pow(radio,2));

        System.out.println("El area del circulo es = "+ area);


    }
}
