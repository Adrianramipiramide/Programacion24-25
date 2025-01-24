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
    static double puntuacion = 0;
    @Override
    public void competir() {
        puntuacion =  Math.random()*100;
        System.out.println("El corredor está compitiendo");
        System.out.printf("Ha obtenido una puntiacion de %.2f \n", puntuacion);
    }

    @Override
    public void entrenar() {
        System.out.println("El corredor esta entranado");
    }

    @Override
    public double obtenerPuntuacion() {
        System.out.println("La puntuacion es "+puntuacion);
        return puntuacion;
    }
}
