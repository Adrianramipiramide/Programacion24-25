/*
Realiza un programa para eliminar todos los números duplicados de un vector de tamaño N.
Los números se generarán aleatoriamente entre 1 y 20. Por ejemplo,
 si el vector toma los valores {4, 7, 11, 4, 9, 5, 11, 7, 3, 5} ha de cambiarse a {4, 7, 11, 9, 5, 3}.

 */
public class controlDuplicados {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 4, 5, 7, 8, 3, 23, 4, 8};


        eliminarDUplicados(array);
    }

    public static void eliminarDUplicados(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    array[i] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
