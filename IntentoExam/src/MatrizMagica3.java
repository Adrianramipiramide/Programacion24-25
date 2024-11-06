/*
Una matriz de dimensiones NxN de enteros es mágica si: Aparecen todos los números enteros desde 1 a N². La suma de los elementos de cada fila,
cada columna, y las dos diagonales dan el mismo valor.
Por ejemplo, la matriz siguiente de dimensiones 5x5 contiene todos los elementos del 1 al 25 y tiene como suma común 65.

Desarrolla un programa que lea una matriz y nos indique si es mágica. Nota: Puedes probar el programa con las
siguientes matrices que son también mágicas (en la imágen)
Intenta crear un generador de matrices mágicas.
 */
public class MatrizMagica3 {
    static final int DIMENSION = 4;
    public static void main(String[] args) {
        int[][] matriz = new int[DIMENSION][DIMENSION];

        boolean esMagica =true;

        MetodosMatriz.llenarMatriz(matriz, DIMENSION);
        MetodosMatriz.mostrarMatriz(matriz, DIMENSION);
        esMagica = MetodosMatriz.aparecenAllNumeros(matriz,DIMENSION,esMagica);
        esMagica = MetodosMatriz.comparadorFilasColumnasDIagonales(matriz,DIMENSION, esMagica);
        MetodosMatriz.sumaFila(matriz,DIMENSION);
        MetodosMatriz.sumaColumna(matriz,DIMENSION);
        MetodosMatriz.sumaDiagonal(matriz,DIMENSION);
        System.out.println("La matriz es magica: " + esMagica);


    }
}
