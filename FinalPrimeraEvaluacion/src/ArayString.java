import javax.swing.*;

/*
Implementa un programa que determine la frecuencia de aparición de cada letra en una cadena de caracteres introducida por teclado.
Comenzará solicitando la cadena y, posteriormente, construirá un array con las frecuencias de cada letra. Finalmente,
imprimirá el array de frecuencias por pantalla. Cuanto más preciso sea, mejor
(ten en cuenta tildes, diéresis, simbolos...) (NOTA: No debe ser sensible a mayúsculas/minúsculas).
 */
public class ArayString {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Introduce la palabra");
        lectorPalabra(palabra);
    }

    public static void lectorPalabra(String palabra) {
        palabra = palabra.toUpperCase();
        for (int i = 0; i < palabra.length(); i++) {
            char letra= palabra.charAt(i);
            System.out.print(letra + "\t");
        }

    }
}
