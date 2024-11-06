

public class MetodosMatriz {
    public static int[][] llenarMatriz(int[][] matriz, final int DIMENSION) {

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                matriz[i][j] = (int) (Math.random() * DIMENSION * DIMENSION);
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz, final int DIMENSION) {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean aparecenAllNumeros(int[][] matriz, final int DIMENSION, boolean esMagica) {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int num = matriz[i][j];
                for (int k = 0; k < DIMENSION; k++) {
                    for (int l = 0; l < DIMENSION; l++) {
                        int numRecorre = matriz[k][l];
                        if ((i != k || j != l) && num == numRecorre) {
                            esMagica = false;
                        }
                    }
                }
            }
        }
        return esMagica;
    }

    public static int sumaFila(int[][] matriz, final int DIMENSION) {
        int sumaFila = 0;
        for (int i = 0; i < DIMENSION; i++) {
           sumaFila += matriz[i][0];
        }
        return sumaFila;
    }

    public static int sumaColumna(int[][] matriz, final int DIMENSION) {
        int sumaColumna = 0;
        for (int i = 0; i < DIMENSION; i++) {
            sumaColumna += matriz[0][i];
        }
        return sumaColumna;
    }

    public static int sumaDiagonal(int[][] matriz, final int DIMENSION) {
        int sumaDiagonal = 0;
        for (int i = 0; i < DIMENSION; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("SUmaDIAGONAL"+sumaDiagonal);
        return sumaDiagonal;
    }
    public static boolean comparadorFilasColumnasDIagonales(int[][] matriz, final int DIMENSION, boolean esMagica) {
        if(sumaFila(matriz,DIMENSION) != sumaColumna(matriz,DIMENSION) && sumaFila(matriz,DIMENSION) != sumaDiagonal(matriz,DIMENSION)){
            esMagica = false;
        }
        return esMagica;
    }
}
