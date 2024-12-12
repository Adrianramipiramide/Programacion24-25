import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorVida implements Comparator<Personaje>{
    @Override
    public void compareTo(ArrayList<Personaje> listaPersonajes){
        ArrayList<Personaje> listaOrdenada = new ArrayList<>();
        for(Personaje p : listaPersonajes){
            boolean libroAgregado = false;
            for (int i = 0; i < listaOrdenada.size(); i++) {
                if( Integer.compareTo){
                    listaOrdenada.add(p);
                    libroAgregado = true;
                }
                if(!libroAgregado){
                    listaOrdenada.add(p);
                }
            }
        }
    }
}
