import java.util.Arrays;

/*
Crea un programa que trabaje con tablas de datos realizando las siguientes funciones.
1- Imprimir la tabla
2- Buscar el elemento máximo de la tabla y dar su posición
3- Buscar el elemento mínimo de la tabla y dar su posición
4- Dar la media de los elementos de la tabla
 */
public class ej15matrix {
    static final int DIMENSION = 5;

    public static void main(String[] args) {
        //10 alumnos 5 asignaturas
        double[][] alumnos = new double[DIMENSION][DIMENSION];
        mostrarArray(alumnos);
        maxNum(alumnos);
        minNum(alumnos);
        realizarMedia(alumnos);

    }

    public static void llenarArray(double[][] alumnos) {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                alumnos[i][j] = (Math.random() * 10);
            }
        }


    }

    public static void mostrarArray(double[][] alumnos) {
        llenarArray(alumnos);
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.printf("%.2f\t", alumnos[i][j]);
            }
            System.out.println();
        }
    }

    public static void maxNum(double[][] alumnos) {
        double max = 0;
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (alumnos[i][j] > max) {
                    max = alumnos[i][j];
                    maxI = (i+1);
                    maxJ = (j+1);
                }
            }
        }
        System.out.printf("\nEl numero máximos es %.2f", max);
        System.out.printf("\n La posiciones del numero máximo es " + maxJ + " " + maxI);

    }

    public static void minNum(double[][] alumnos) {
        double min = 10;
        int minI = 0;
        int minJ = 0;

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                if (alumnos[i][j] < min) {
                    min = alumnos[i][j];
                    minI = (i + 1);
                    minJ = (j + 1);
                }
            }
        }
        System.out.printf("\n El número mínimo es %.2f", min);
        System.out.printf("\n La posiciones del numero minimo es " + minJ + " " + minI);

    }
    public static void realizarMedia(double[][] alumnos){
        double acumulador = 0;

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
               acumulador += alumnos[i][j];
            }
        }
        double notaMedia = acumulador/(DIMENSION*DIMENSION);
        System.out.printf("\n\n La nota media es de %.2f", notaMedia);
    }
}
