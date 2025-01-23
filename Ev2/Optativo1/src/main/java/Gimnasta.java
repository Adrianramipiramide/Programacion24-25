import java.time.LocalDate;

public class Gimnasta extends Atleta {
    private EspecialidadGimnasia especialidadGimnasia;
    private double dificultadRutina;
    private double puntiacionMaxima;

    public Gimnasta(String nombre, LocalDate fechaNacimiento, Pais pais, EspecialidadGimnasia especialidadGimnasia, double dificultadRutina, double puntiacionMaxima) {
        super(nombre, fechaNacimiento, pais);
        this.especialidadGimnasia = especialidadGimnasia;
        this.dificultadRutina = dificultadRutina;
        this.puntiacionMaxima = puntiacionMaxima;
    }

    @Override
    public void competir() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public double obtenerPuntuacion() {
        return 0;
    }
}
