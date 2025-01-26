import java.util.ArrayList;
import java.util.List;

public class Competicion {
    private String nombre;
    private static ArrayList<Atleta> atletas = new ArrayList<>();
    private int capacidadMaxima;

    public Competicion(String nombre) {
        this.nombre = nombre;
    }

    public Competicion(){}

    public static void agregarAtlerta(Atleta atleta) {
        atletas.add(atleta);
    }

    public void agregarAtletas(ArrayList<Atleta> listaAtletas) {
        atletas.addAll(listaAtletas);

    }

    public String getNombre() {
        return nombre;
    }

    public static List<Atleta> getAtletas() {
        return atletas;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    static double[] puntuaciones;

    //Dar valores aleatorios a los atletas como si hubieran participado y guardar los resultados en una lista
    public static void simularCompeticion() {

        double puntuacion;

        for (Atleta a : atletas) {
            puntuacion = (Math.random() * 100);
            System.out.printf("%s su puntuacion es  %.2f \n", a.getNombre(), puntuacion);
            puntuaciones = new double[]{puntuacion};
        }
    }


    public Atleta determinarGanador() {
        Atleta ganador = null;
        int ganadorPuntuacion = 0;
        for (int i = 0; i < atletas.size(); i++) {
            if (puntuaciones[i] >= ganadorPuntuacion) {
                ganadorPuntuacion = i;
            }
            ganador = atletas.get(i);
        }
        return ganador;
    }

}
