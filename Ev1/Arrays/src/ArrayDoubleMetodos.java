import java.util.Scanner;

/*
Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes de una clase y los guarde en un array.
Después, mostrará esas calificaciones (cada una en una línea). A continación mostrará la media del curso y el número de aprobados y suspensos.
Se usará un método para calcular la nota media y otro para calcular el número de suspensos.
 */
public class ArrayDoubleMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] calificacion = new double[5];
        System.out.println("Introduce las calificaciones de los 30 alumnos");
        for (int i = 0; i < calificacion.length; i++) {
            calificacion[i] = sc.nextDouble();
            if(calificacion[i] >= 10){
                System.out.println("Las notas no deben ser superiores a 10");
                break;
            } else if (calificacion[i]<0) {
                break;
            }
        }
        try{
            MediaCurso(calificacion);
            SuspensosAprobados(calificacion);
            notaMax(calificacion);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void MediaCurso(double[] notas) {
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }
        System.out.println("La media del curso es " + sumaNotas/notas.length);

    }

    public static void SuspensosAprobados(double[] notas) {
        int suspensos = 0;
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5){
                aprobados++;
            }else {
                suspensos++;
            }
        }
        System.out.println("El numero de aprobados es: " + aprobados+ "\nEl numero de suspensos es: " + suspensos);
    }

    public static void notaMax(double[] notas) {
      double max = 0;
      for (int i = 0; i < notas.length; i++) {
          if (notas[i] > max) {
              max = notas[i];
          }
      }
        System.out.println("La nota más alta es "+ max);
    }
}
