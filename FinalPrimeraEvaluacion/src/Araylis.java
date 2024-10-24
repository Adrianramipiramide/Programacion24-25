import java.util.ArrayList;

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

        notaMaxima();
        mostrarNotaMin();
        mostrarMediaCurso();
        System.out.println();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j]+ "\t\t");
            }
            System.out.println();
        }

    }

    public static void notaMaxima() {
        double max1 = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[i][j] > notas[0][j]) {
                    max1 = notas[i][j];
                }
            }
        }
        System.out.println("La nota máxima del alumno 1 es "+ max1);

        System.out.println();
        System.out.println("La nota máxima es "+max1);
    }

    public static void mostrarNotaMin(){
        double min = 10;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                if(notas[i][j]<min){
                    min = notas[i][j];
                }
            }
        }
        System.out.println("La nota mínima es "+ min);
    }

    public static void mostrarMediaCurso(){
        double mediaCurso=0;
        double media=0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {

                mediaCurso += notas[i][j];
            }
        }
        media= mediaCurso/12;
        System.out.printf("La nota media del curso es %.2f", media);
    }
}
