import java.util.ArrayList;
import java.util.TreeSet;

public class MainOrdenador {
    public static void main(String[] args) {
        TreeSet<Ordenador> listaOrdenador = new TreeSet<>();

        listaOrdenador.add(new Ordenador("789897",16,199));
        listaOrdenador.add(new Ordenador("97989",16,500));
        listaOrdenador.add(new Ordenador("6746987",16,190));
        listaOrdenador.add(new Ordenador("657476567",16,1000));
        listaOrdenador.add(new Ordenador("435345",16,430));
    }
}
