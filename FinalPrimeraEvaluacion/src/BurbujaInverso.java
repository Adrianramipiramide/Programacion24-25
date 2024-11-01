import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
Modifica el algoritmo de ordenación de la burbuja ara que ordene un vector de enteros en orden decreciente.
 */
public class BurbujaInverso {
    public static void main(String[] args) {
        ArrayList<Integer> vector = new ArrayList<>();
        vector.add(1);
        vector.add(2);
        vector.add(1);
        vector.add(4);
        vector.add(2);
        vector.add(21);
        vector.add(7);
        vector.add(3);
        System.out.println(vector);
        Collections.sort(vector);
        System.out.println(vector);


        //Ahora vamos a hacerlo con el método burbuja
        int[] cadenaNumerica = {2, 4, 3, 57, 5, 7, 64, 22};
        metodoBurbujaInverso(cadenaNumerica);
    }

    public static void metodoBurbujaInverso(int[] cadenaNum) {

        for (int i = 0; i < cadenaNum.length - 1; i++) {
            for (int j = 0; j < cadenaNum.length - 1 - i; j++) {
                if (cadenaNum[j] < cadenaNum[j + 1]) {
                    int temp = cadenaNum[j];
                    cadenaNum[j] = cadenaNum[j+1];
                    cadenaNum[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < cadenaNum.length; i++) {
            System.out.print(cadenaNum[i]+"\t");
        }
    }
}
