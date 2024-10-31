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
        double[][] alumnos = new double[10][5];

        llenarArray(alumnos);
        mostrarArray(alumnos);

    }
    public static void llenarArray(double[][] alumnos){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                alumnos[i][j] = (Math.random()*10);
            }
        }
    }
    public static void mostrarArray(double[][] alumnos){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(alumnos[i][j]);
            }
            System.out.println();
        }
    }
}
