import java.util.Comparator;
import java.util.List;

public class SistemaGestionCompeticiones implements Comparable<Competicion> {

    List<Competicion> competiciones;

    public void agregarCompeticion(Competicion competicion) {
        competiciones.add(competicion);
    }

    public List<Competicion> getCompeticiones() {
        for(Competicion competicion : competiciones) {
            System.out.println(competicion.getNombre());
        }
        return competiciones;
    }

    public void simularCompeticiones() {

        for(Competicion competicion : competiciones) {
            System.out.println("La competicion "+ competicion.getNombre()+ " comienza");
            competicion.simularCompeticion();
        }
    }


    @Override
    public int compareTo(Competicion o) {
        for(Competicion competicion: competiciones) {
            if(o.getNombre().equals(competicion.getNombre())){
                return 1;
            }
        }
        return 0;
    }
}
