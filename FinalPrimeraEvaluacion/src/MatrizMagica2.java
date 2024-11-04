import javax.swing.*;
import java.util.Scanner;

/*
Una matriz de dimensiones NxN de enteros es mágica si: Aparecen todos los números enteros desde 1 a N².
La suma de los elementos de cada fila, cada columna, y las dos diagonales dan el mismo valor. Por ejemplo,
la matriz siguiente de dimensiones 5x5 contiene todos los elementos del 1 al 25 y tiene como suma común 65.

Desarrolla un programa que lea una matriz y nos indique si es mágica. Nota: Puedes probar el programa con las
siguientes matrices que son también mágicas (en la imágen)
Intenta crear un generador de matrices mágicas
 */
public class MatrizMagica2 {
    static final int DIMENSION = 3;

    public static void main(String[] args) {
        int[][] matriz = new int[DIMENSION][DIMENSION];
        generarMatriz(matriz);
        comprobarSiMagica(matriz);
    }

    public static void generarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * El metodo compreba si la matriz es mágica evaluando si los numeros son correctos
     *
     * @param matriz int[][]
     * @return boolean
     */
    public static boolean comprobarSiMagica(int[][] matriz) {
        int fila = 0;
        int diagonal = 0;
        boolean esMagica = true;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {

                if (matriz[i][j] > Math.pow(DIMENSION, 2) || matriz[i][j] < 0) {
                    esMagica = false;
                }
                if (j == 0) {
                    fila += matriz[i][0];
                }
            }
        }
        for (int i = 0; i < DIMENSION; i++) {
            diagonal += matriz[i][i];
        }

        if (diagonal != fila) {
            esMagica = false;
        }
         filasYcolumnasIguales(matriz);


        System.out.println("La suma de la fila es " + fila);
        System.out.println("La suma de la diagonal es " + diagonal);
        System.out.println("La matriz es magica :" + esMagica);

        return esMagica;
    }
//Dividir en varios metodos columnas filas y diagonales por separado
    public static boolean filasYcolumnasIguales(int[][] matriz) {
        boolean magica = true;
        int fila = 0;
        int columna = 0;
        int diagonal = 0;
        int diagonalOpuesta = 0;
        for (int i = 0; i < DIMENSION; i++) {

            fila += matriz[i][DIMENSION - i];

        }
        if(fila != fila){
            magica=false;
        }

        for (int i = 0; i < DIMENSION; i++) {
            columna += matriz[0][i];

        }
        for (int i = 0; i < DIMENSION; i++) {
            diagonal += matriz[i][i];
        }

        for (int i = 0; i < DIMENSION; i++) {
            diagonalOpuesta += matriz[DIMENSION - i][i];
        }

        if (fila != columna || fila != diagonal) {
            magica = false;
        }
        return magica;
    }
}

