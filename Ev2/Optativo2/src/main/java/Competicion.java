import java.util.ArrayList;
import java.util.List;

public class Competicion {
    private String nombre;
    private ArrayList<Atleta> atletas = new ArrayList<>();

    public Competicion(String nombre, ArrayList<Atleta> atletas) {
        this.nombre = nombre;
        this.atletas = atletas;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAtleta(Atleta atleta) {
        if (atletas.size() > 10) {
            throw new IndexOutOfBoundsException("No puede haber más de 10 atletas en la competicion");
        }
        atletas.add(atleta);
    }

    List<Double> puntuaciones;

    public void simularCompeticion() {
        double puntuacion;
        for (Atleta atleta : atletas) {
            puntuacion = Math.random() * 100;
            puntuaciones.add(puntuacion);
        }
    }

    public Atleta determinarGanador(){
        double puntuacionMax =0;
        Atleta ganador = null;
        for (int i = 0; i < puntuaciones.size(); i++) {
            if(puntuaciones.get(i) >= puntuacionMax){
                puntuacionMax = puntuaciones.get(i);
                ganador = atletas.get(i);
            }
        }
        return ganador;
    }

    public void resultadosCompeticion() {
        System.out.println("El resultado de la competicion es " + nombre);
        for (int i = 0; i < atletas.size(); i++){
            System.out.printf(" La puntuación del atleta %s es %.2f\n", atletas.get(i).getNombre(), puntuaciones.get(i));
        }
    }
}
