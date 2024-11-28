import java.util.LinkedList;

public class PilaPalabras {
    private String palabra;

    private LinkedList<String> pila;

    public PilaPalabras(String palabra, LinkedList<String> pila) {
        this.palabra = palabra;
        this.pila = pila;
    }

    public static void apilarPalabras(String palabra, LinkedList<String> pila) {
        pila.add(palabra);
    }

    public static String desapilarPalabras(LinkedList<String> pila) {
      return pila.removeLast();

    }

    public static void mostrarPila(LinkedList<String> pila){
        System.out.println(pila);
    }
}
