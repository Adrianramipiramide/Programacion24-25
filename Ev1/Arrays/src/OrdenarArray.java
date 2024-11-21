import java.util.Scanner;

/*
Escribe un programa que pida 10 números por teclado y los almacene en un array,
 y que luego muestre los números introducidos junto con las palabras "máximo" y "mínimo" junto al máximo y al mínimo respectivamente.
 En caso de que estén repetidos lo hará junto a cada uno de ellos.
 */
public class OrdenarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Ingrese 10 numero: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int MIN = array[0];
        int MAX = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= MAX) {
                MAX = array[i];
            }
            if (array[i] <= MIN) {
                MIN = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] == MIN) {
                System.out.print("MIN");
            }
            if (array[i] == MAX) {
                System.out.print("MAX");
            }
            System.out.print(array[i] + "\t");

        }
    }
}

