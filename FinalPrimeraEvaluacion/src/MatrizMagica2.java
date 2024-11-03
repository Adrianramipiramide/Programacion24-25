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

    public static boolean comprobarSiMagica(int[][] matriz) {
        int fila = 0;
        int diagonal = 0;
        boolean esMagica = true;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {

                if (matriz[i][j] > Math.pow(DIMENSION, 2)) {
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
        System.out.println("La suma de la fila es " + fila);
        System.out.println("La suma de la diagonal es " + diagonal);
        System.out.println("La matriz es magica :" + esMagica);

        return esMagica;
    }
}

