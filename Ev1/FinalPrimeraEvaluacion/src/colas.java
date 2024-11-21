import java.util.ArrayList;

//Pon gente en la cola y sacalos con metodos
public class colas {
    public static void main(String[] args) {
        int posicionActual = 0;
        final int Dimension = 50;
        String[] listaDNI = new String[Dimension];
        posicionActual = addCola("456456", listaDNI, posicionActual);
        posicionActual = addCola("5643F", listaDNI, posicionActual);
        posicionActual = addCola("5464B", listaDNI, posicionActual);

        mostrarCola(listaDNI);
        posicionActual = removeCola("", posicionActual, listaDNI);

        posicionActual= addCola("BBBB5", listaDNI, posicionActual);
        posicionActual= addCola("FFFFF", listaDNI, posicionActual);

        mostrarCola(listaDNI);
        posicionActual = removeCola("", posicionActual, listaDNI);
        posicionActual = removeCola("", posicionActual, listaDNI);
        posicionActual = removeCola("", posicionActual, listaDNI);

        mostrarCola(listaDNI);
    }

    public static int addCola(String dni, String[] listaDNI, int posicionActual) {
        listaDNI[posicionActual] = dni;

        System.out.println("La persona con el DNI " + dni + " esta en la posicion " + (posicionActual + 1));
        return posicionActual + 1;
    }

    public static int removeCola(String dni, int posicionActual, String[] listaDNI) {

        for (int i = 0; i < posicionActual; i++) {
            listaDNI[posicionActual - i - 1] = listaDNI[i];
        }

        listaDNI[posicionActual - 1] = null;

        return posicionActual-1;
    }

    public static void mostrarCola(String[] listaDNI) {
        System.out.println("Mostrando la cola");
        System.out.println();
        for (int i = 0; i < listaDNI.length; i++) {
            System.out.println(listaDNI[i]);
        }
    }
}
