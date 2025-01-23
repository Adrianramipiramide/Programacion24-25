import java.time.LocalDate;

public final class Corredor extends Atleta{
    private int distancia;
    private double mejorTiempo;
    private double velocidadMax;
    private int sesionesEntrenamiento;

    public Corredor(String nombre, LocalDate fechaNacimiento, Pais pais, int distancia, double mejorTiempo, double velocidadMax, int sesionesEntrenamiento) {
        super(nombre, fechaNacimiento, pais);
        this.distancia = distancia;
        this.mejorTiempo = mejorTiempo;
        this.velocidadMax = velocidadMax;
        this.sesionesEntrenamiento = sesionesEntrenamiento;
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
