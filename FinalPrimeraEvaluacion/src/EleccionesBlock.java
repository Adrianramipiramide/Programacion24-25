import java.util.InputMismatchException;
import java.util.Scanner;

//Programa contabilizador de botos de las elecciones del gobierno de España
public class EleccionesBlock {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int NUMVOTANTES = 10;
        String[] candidatos = new String[5];
        int[] Nvotos = new int[NUMVOTANTES];

        llenarCandidatos(candidatos);
        listaVotos(Nvotos, candidatos);
        mostrarGanador(candidatos, Nvotos);
    }

    /**
     * Este método llena el array de Strings con el nombre de los candidatos
     *
     * @param candidatos String[]
     */
    public static void llenarCandidatos(String[] candidatos) {
        System.out.println("Intruduce el nombre de los candidatos");
        for (int i = 0; i < candidatos.length; i++) {
            candidatos[i] = sc.nextLine();
        }
        for (int i = 0; i < candidatos.length; i++) {
            System.out.print(candidatos[i] + " " + (i + 1) + "\t");
        }
        System.out.println();
    }

    public static void listaVotos(int[] Nvotos, String[] candidatos) {
        int[] votos = new int[Nvotos.length];
        for (int i = 0; i < Nvotos.length; i++) {
            System.out.println("La persona " + (i + 1) + " con el DNI " + (int) (Math.random() * 1000000) + " decide votar a : ");
            
            try {
                Nvotos[i] = sc.nextInt();
                if (Nvotos[i] == 1) {
                    votos[0]++;
                } else if (Nvotos[i] == 2) {
                    votos[1]++;
                } else if (Nvotos[i] == 3) {
                    votos[2]++;
                } else if (Nvotos[i] == 4) {
                    votos[3]++;
                } else if (Nvotos[i] == 5) {
                    votos[4]++;
                } else {
                    System.out.println("Su voto es nulo");
                }
            } catch (InputMismatchException e) {
                System.out.println("Su voto es nulo");
            }
        }

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + "\t" + votos[i]);
        }

    }

    public static void mostrarGanador(String[] candidatos, int[] votos) {

        String ganador = candidatos[0];
        for (int i = 1; i < candidatos.length; i++) {
            if (votos[i] >= votos[i - 1]) {
                ganador = candidatos[i];
            }
        }

        System.out.println("El ganador de las elecciones generales ha sido: " + ganador);
    }
}
