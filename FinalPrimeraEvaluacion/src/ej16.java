/**
 * Realiza un metodo que reciba una matriz de dimensiones NxN y almacene sobre ella su traspuesta.
 * La matriz traspuesta es aquella que se obtiene cambiando ordenadamente las filas por las columnas. Ejemplo en la imágen
 */
public class ej16 {
    static final int DIMENSION = 5;

    public static void main(String[] args) {

        int[][] matriz = new int[DIMENSION][DIMENSION];

        generarMatriz(matriz);

    }

    public static void generarMatriz(int[][] matriz) {
        int[][] numeroRandom = new int[DIMENSION][DIMENSION];
        //matriz normal
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                numeroRandom[i][j] = ((int) (Math.random() * 10));
                matriz[i][j] = numeroRandom[i][j];
                System.out.print(numeroRandom[i][j] + "\t");
            }
            System.out.println();
        }

        //matriz traspuesta
        System.out.println("La matriz traspuesta es");
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(numeroRandom[j][i] + "\t");
            }
            System.out.println();
        }

    }

    public static void generarMatrizTraspuesta(int[][] matriz) {

    }
}
