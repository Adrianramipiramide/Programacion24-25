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
    static final int DIMENSION = 5;

    public static void main(String[] args) {
        int[][] matriz = new int[DIMENSION][DIMENSION];
        generarMatriz(matriz);
    }

    public static void generarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

    }
    public static void comprobarSiMagica(int[][] matriz) {

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int fila = 0;
                fila += matriz[i][0] ;
                
            }
        }
    }
}

