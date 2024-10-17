/*
Rellena un array con los valores del número de habitantes de 200 poblaciones
de entre 100 y 1000 habitantes y ordénalos de mayor a menor. Comprueba si alguna población tiene 500 habitantes exáctamente.
 */
public class ArrayDoblePueblos {
    public static void main(String[] args) {
        int[] numHabitantes = new int[200];

        llenarArray(numHabitantes);
        System.out.println();
        System.out.println("Array Ordenado");
        ordenarArray(numHabitantes);

    }

    public static void ordenarArray(int[] habitantesNum) {

        try {
            for (int i = 0; i < habitantesNum.length - 1; i++) {
                for (int j = 0; j < habitantesNum.length -1 ; j++) {

                    int numActual = habitantesNum[j];
                    int numProximo = habitantesNum[j + 1];

                    if (numProximo < numActual) {
                        habitantesNum[j] = numProximo;
                        habitantesNum[j + 1] = numActual;
                    }

                }

            }


            for (int i = 0; i < habitantesNum.length; i++) {
                System.out.println("El número de habitantes de la localidad " + (i + 1) + " es " + habitantesNum[i]);
            }


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ha ocurrido un error al ordenar el array");
        }


    }

    public static void llenarArray(int[] habitantesNum) {

        for (int i = 0; i < habitantesNum.length; i++) {
            habitantesNum[i] = (int) (Math.random() * 1000);
            while (habitantesNum[i] < 100) {
                habitantesNum[i] = (int) (Math.random() * 1000);
            }
        }
    }
}
