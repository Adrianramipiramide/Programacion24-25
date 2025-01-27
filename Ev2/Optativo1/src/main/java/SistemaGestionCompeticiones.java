import java.util.ArrayList;


public class SistemaGestionCompeticiones implements Comparable<Competicion> {
    ArrayList<Competicion> competiciones = new ArrayList();

    public void agregarCompeticion(Competicion competicion) {
        competiciones.add(competicion);
    }

    public ArrayList<Competicion> mostrarCompeticiones() {
        ArrayList<Competicion> competicioness = new ArrayList();
        for (Competicion competicion : competiciones) {
            System.out.println(competicion);
            competicioness.add(competicion);
        }
        return competicioness;
    }

    static double[] puntuaciones;

    public void simularTodasCompeticiones() {
        puntuaciones = new double[competiciones.size()];
        for (int i = 0; i < competiciones.size(); i++) {
            double puntuacion = Math.random() * 100;
            System.out.println("La puntuacion de " + competiciones.get(i).getNombre() + " es " + puntuacion);
            puntuaciones[i] = puntuacion;
        }
    }

    @Override
    public int compareTo(Competicion o) {
        int resultado = 0;
        for (int i = 0; i < competiciones.size(); i++) {
            if (o.getNombre().equals(competiciones.get(i).getNombre())) {
                resultado = 1;
            }
        }
        return resultado;
    }
}
