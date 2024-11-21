import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/*
Una empresa de autobuses quiere informatizar su servicio de reservas para un evento. De momento se conforman con guardar
el número de dni del que ha reservado y el número de viajeros que transporta.
Eso sí, un mismo contacto no puede hacer varias reservas; sólo una con todos los pasajeros. Implementa una solución.
 */
public class Autobuses {
    static HashMap<String, Integer> reserva = new HashMap<>();

    public static void main(String[] args) {

        introDatosReserva();
        introDatosReserva();
        introDatosReserva();
        System.out.println(reserva);
        System.out.println("Se han reservado " + reserva.get("1111") + " plazas" + " para el DNI 1111");
        System.out.println(getNumreservas());

    }

    /**
     * añade reserva que esta dentro de introduce datos
     * @param numViajeros int
     * @param dni String
     */
    public static void addReserva(int numViajeros, String dni) {
        reserva.put(dni, numViajeros);

    }

    /**
     * contar el numero de reservas
     * @return int
     */
    public static int getNumreservas() {
        int reservas = 0;
        reservas = reserva.size();

        return reservas;
    }
    
    public static void introDatosReserva() {
        try {
            String dni = JOptionPane.showInputDialog("Introduce el DNI");
            int numVijeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de viajeros"));
            addReserva(numVijeros, dni);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Introduce valores validos");
        }
    }
}
