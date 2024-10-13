import java.util.Scanner;

/*
Escribe un programa lea 15 números por teclado y los almacene en un array.
 Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc.
 El número que se encuentre en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array rotado.
 */
public class ArrayCambioPosicion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        System.out.println("Introduce 15 números");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
//la i empieza en el 2 y no en el 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[0]) {
                array[1] = array[0];
            } else if (array[i]==array[14]) {
                array[0] = array[14];
            } else {
                array[i] = array[i + 1];
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
