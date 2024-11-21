import java.util.Arrays;
import java.util.Scanner;

/*
Teniendo en cuenta los datos que aparecen más abajo, realiza los siguientes métodos (corresponden a las notas de 3 alumnos en 4 asignaturas):
Visualizar nota máxima, mínima y media de cada alumno. Visualizar nota máxima, mínima y media de cada asignatura. Visualizar nota máxima,
mínima y media del curso. A partir de una nota que se pedirá por teclado, visualizar qué alumnos la han obtenido y en qué asignaturas
(aunque en el ejemplo no se cumple, tened en cuenta que una misma nota podría aparecer repetida en distintas posiciones de la matriz…).
DATOS:{ { 5.6, 9.5, 6.8, 7 },{ 7.9, 5.2, 5.7, 6.3 },{ 9.8, 8, 7.6, 8.5} }
 */
public class Araylis {
    static final double[][] notas = {{5.6, 9.5, 6.8, 7}, {7.9, 5.2, 5.7, 6.3}, {9.8, 8, 7.6, 8.5}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        notaMaxima();
        System.out.println();
        mostrarNotaMin();
        System.out.println();
        mostrarMediaCurso();
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("Introduce una nota");
        double notaEleccion = sc.nextDouble();
        mostrarNotaElegida(notaEleccion);

    }

    public static void notaMaxima() {
        double max1 = 0;
        double max2 = 0;
        double max3 = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[0][j] > max1) {
                    max1 = notas[0][j];
                }
                if (notas[1][j] > max2) {
                    max2 = notas[1][j];
                }
                if (notas[2][j] > max3) {
                    max3 = notas[2][j];
                }
            }
        }

        System.out.println();
        System.out.println("La nota máxima del alumno 1 es " + max1);
        System.out.println("La nota máxima del alumno 2 es " + max2);
        System.out.println("La nota máxima del alumno 3 es " + max3);
    }


    public static void mostrarNotaMin() {
        double min1 = 10;
        double min2 = 10;
        double min3 = 10;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[0][j] <= min1) {
                    min1 = notas[0][j];
                }
                if (notas[1][j] <= min2) {
                    min2 = notas[1][j];
                }
                if (notas[2][j] < min3) {
                    min3 = notas[2][j];
                }

            }
        }
        System.out.println("La nota mínima del alumno 1 es " + min1);
        System.out.println("La nota mínima del alumno 2 es " + min2);
        System.out.println("La nota mínima del alumno 3 es " + min3);
    }


    public static void mostrarMediaCurso() {
        double mediaCurso = 0;
        double media = 0;
        double mediaAsignatura1 = 0;
        double mediaAsignatura2 = 0;
        double mediaAsignatura3 = 0;
        double mediaAsignatura4 = 0;

        //media curso de los alumnos
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                mediaCurso += notas[i][j];
            }
        }
        //media curso de las asignaturas
        for (int i = 0; i < notas.length; i++) {
            mediaAsignatura1 += notas[i][0];
            mediaAsignatura2 += notas[i][1];
            mediaAsignatura3 += notas[i][2];
            mediaAsignatura4 += notas[i][3];
        }


        media = mediaCurso / 12;
        System.out.printf("La nota media del curso es %.2f \n", media);
        System.out.printf("La nota media de la asignatura 1 es %.2f \n", mediaAsignatura1 / 3);
        System.out.printf("La nota media de la asignatura 2 es %.2f \n", mediaAsignatura2 / 3);
        System.out.printf("La nota media de la asignatura 3 es %.2f \n", mediaAsignatura3 / 3);
        System.out.printf("La nota media de la asignatura 4 es %.2f \n", mediaAsignatura4 / 3);
    }

    public static void mostrarNotaElegida(double notaEleccion) {
        boolean loHaEncontrado = false;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[i][j] == notaEleccion) {
                    loHaEncontrado = true;
                    System.out.printf("La nota %d ha sido en contrada en la asignatura %d que ha sido sacada por el alumno %d", notaEleccion, i, j);

                }
            }
        }
        System.out.println("La nota no esta en el Array");
    }
}
