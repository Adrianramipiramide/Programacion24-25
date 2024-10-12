import java.util.Scanner;

/*
Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso, es decir,
 el primero que se introduce es el último en mostrarse y viceversa.
 */
public class arrayInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres");
        final int cantidadNumeros=sc.nextInt();
        int[] listaNumeros= new int[cantidadNumeros];

        System.out.println("Introduce "+ cantidadNumeros+" numeros del array");
        for (int i = 0; i < cantidadNumeros; i++) {

            listaNumeros[i] =sc.nextInt();


        }
        for (int i = cantidadNumeros-1; i >= 0; i--) {
            //Debe cambiarse el orden para que imprima el ultimo numero primero
            System.out.println(listaNumeros[i]);
        }
    }
}
