import java.time.LocalDate;

public final class Gimnasta extends Atleta {
    private EspecialidadGimnasia especialidadGimnasia;
    private double dificultadRutina;
    private double puntiacionMaxima;

    public Gimnasta(String nombre, LocalDate fechaNacimiento, Pais pais, EspecialidadGimnasia especialidadGimnasia, double dificultadRutina, double puntiacionMaxima) {
        super(nombre, fechaNacimiento, pais);
        this.especialidadGimnasia = especialidadGimnasia;
        this.dificultadRutina = dificultadRutina;
        this.puntiacionMaxima = puntiacionMaxima;
    }
    static double puntuacion;
    @Override
    public void competir() {
        puntuacion =  Math.random()*100;
        System.out.println("El corredor está compitiendo");
        System.out.printf("Ha obtenido una puntiacion de %.2f \n", puntuacion);
    }

    @Override
    public void entrenar() {
        System.out.println("El gimnasta está entrenando");
    }

    @Override
    public double obtenerPuntuacion() {
        System.out.println("La puntuacion es "+puntuacion);
        return puntuacion;
    }
}
