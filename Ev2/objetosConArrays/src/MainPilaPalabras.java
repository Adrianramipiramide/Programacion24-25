import java.util.LinkedList;

public class MainPilaPalabras {
    public static void main(String[] args) {
        LinkedList<String> pila = new LinkedList<>();
        PilaPalabras.apilarPalabras("coche",pila);
        PilaPalabras.apilarPalabras("barco",pila);
        PilaPalabras.apilarPalabras("camión",pila);
        PilaPalabras.mostrarPila(pila);
        PilaPalabras.desapilarPalabras(pila);
        PilaPalabras.mostrarPila(pila);
        PilaPalabras.apilarPalabras("avión",pila);
        PilaPalabras.apilarPalabras("moto",pila);
        PilaPalabras.mostrarPila(pila);
        PilaPalabras.desapilarPalabras(pila);
        PilaPalabras.mostrarPila(pila);

    }
}
