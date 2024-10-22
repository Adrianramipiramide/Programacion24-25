import javax.swing.*;

import static java.lang.Math.random;

/*
Una empresa necesita atender a sus clientes en orden de llegada. Crea una estructura que nos permita almacenar el
número del DNI en orden de llegada, para posteriormente, atenderles.
 */
public class DniSortBinarySearch {
    public static void main(String[] args) {
        final int Dimension = 3;
        int posicionPersona = 0;

        String[] clientes = new String[Dimension];

        ponerALaCola(clientes, Dimension, posicionPersona);
        mostrarCola(clientes, posicionPersona, Dimension);
        sacarDeCola(clientes, Dimension, posicionPersona);


    }

    //Lleno el array poniendo a las personas en la cola
    public static void ponerALaCola(String[] personasDNI, final int personasEnCola, int posicionPersona) {

        for (int i = 0; i < personasEnCola; i++) {
            personasDNI[i] = JOptionPane.showInputDialog("Introduce el DNI de la persona que acab de llegar a la cola");
        }
    }

    //muestro el array con los DNI y las posiciones
    public static void mostrarCola(String[] personasDNI, int posicionPersonas, final int Dimension) {
        System.out.println();
        for (int i = 0; i < Dimension; i++) {
            posicionPersonas++;
            System.out.println("La persona con el DNI " + personasDNI[i] + " se encuntra en la posicion " + posicionPersonas);
        }
    }

    public static void sacarDeCola(String[] personasDNI, final int Dimension, int posicionPersona) {

        String input = JOptionPane.showInputDialog("Cuantas personas quieres sacar de la cola");
        int personasqueSacas = Integer.parseInt(input);
        System.out.println("\nPersonas que han salido de la cola");
        for (int i = 0; i < personasqueSacas; i++) {
            if (personasqueSacas > Dimension) {
                break;
            }

            System.out.println("La persona con el DNI "+personasDNI[i] + " ha salido de la cola\n");
        }
        for (int i = personasqueSacas; i < Dimension; i++) {
            System.out.println("La persona con el DNI "+ personasDNI[i]+ " se encuentrá en la posición "+ (i+1-personasqueSacas));
        }
    }
}
