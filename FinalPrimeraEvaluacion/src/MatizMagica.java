import java.util.Scanner;

/*
Una matriz de dimensiones NxN de enteros es mágica si: Aparecen todos los números enteros desde 1 a N².
La suma de los elementos de cada fila, cada columna, y las dos diagonales dan el mismo valor. Por ejemplo,
la matriz siguiente de dimensiones 5x5 contiene todos los elementos del 1 al 25 y tiene como suma común 65.
Desarrolla un programa que lea una matriz y nos indique si es mágica. Nota: Puedes probar el programa con las siguientes matrices que son también mágicas:
 */
public class MatizMagica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz");
        final int Dimension = sc.nextInt();
        int[][] matriz = new int[Dimension][Dimension];
        llenarMatriz(matriz, Dimension);
        duplicarMatriz(matriz, Dimension);
    }

    public static void llenarMatriz(int[][] matriz, int Dimension) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los valores de la matriz");
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }
//mostrar matriz
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void duplicarMatriz(int[][] matriz, int Dimension) {
        System.out.println("Matriz al cuadrado");
        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                //double resultado = Math.pow(matriz[i][j],2);
                matriz[i][j] = matriz[i][j] * matriz[i][j];
            }
        }

        for (int i = 0; i < Dimension; i++) {
            for (int j = 0; j < Dimension; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
