/*
Crea un array de notas de un alumno. Además, crea una variable que almacene el número de
años que lleva estudiando en el centro. Genera un método que cambie el valor de los anos que
  lleva estudiando en el centro (pasado como un argumento). Luego otro que cambie la primera nota de array (pasado como argumento).
  Invoca los dos métodos, presenta luego los datos y observa lo que pasa. (Utiliza .length).
 */
public class MetodoArray {
    public static void main(String[] args) {
        int[] notas = {5, 7, 8, 2, 6, 8, 2};
        int numeroAniosEstudiados = 2;

        aniosEstudiadosCambiar(numeroAniosEstudiados);
        calcularNotas(notas);
    }

    public static void aniosEstudiadosCambiar(int numbreAniosEstudiados) {
        numbreAniosEstudiados++;
        System.out.println("LLeva " + numbreAniosEstudiados + " años estudiados");
    }

    public static void calcularNotas(int[] notas) {
        notas[1] = 10;
        System.out.println("La nota que tengo es "+notas[1]);
    }
}
