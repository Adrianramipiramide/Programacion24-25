import java.util.Scanner;

/*
Realiza un metodo que devuelva cierto si la matriz (tabla de números) de dimensiones NxN que se le pasa como argumento es simétrica.
Una matriz A es simétrica si a(i,j) = a(j,i).
 */
public class MatrizSimetrica {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa la dimensión de la matriz");
        int Dimension = sc.nextInt();
        int[][] matriz = new int[Dimension][Dimension];
        generarMatriz(matriz, Dimension);
        esSimetrica(matriz, Dimension);
    }

    /**
     *
     *este metodo genrea una matriz de la dimension indicada por teclado
     * @param matriz int[][]
     * @param Dimension int
     * @return int[][]
     * */
    public static int[][] generarMatriz(int[][] matriz, int Dimension) {
        System.out.println("Introduce los valores de la matriz");
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
//mostrar la matriz
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        return matriz;
    }

    /**
     * @param matriz
     * @param dimension
     * @return
     */
    public static boolean esSimetrica(int[][] matriz, int dimension) {
        boolean simetria= false;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == matriz[j][i]) {
                    contador++;
                    if(contador >= (dimension*dimension)){
                        simetria = true;
                    }
                } else {
                    simetria= false;
                }
            }
        }
        System.out.println(simetria);
        return simetria;
    }
}
