import java.util.ArrayList;

//Pon gente en la cola y sacalos con metodos
public class colas {
    public static void main(String[] args) {
        int posicionActual = 0;
        final int Dimension = 50;
        String[] listaDNI = new String[Dimension];
        addCola("456456", listaDNI, posicionActual);
        addCola("5643F", listaDNI, posicionActual);

    }

    public static int addCola(String dni, String[] listaDNI, int posicionActual) {
        listaDNI[posicionActual] = dni;

        System.out.println("La persona con el DNI " + dni + " esta en la posicion " + (posicionActual + 1));

        return posicionActual;
    }
}
