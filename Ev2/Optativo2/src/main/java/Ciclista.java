import java.time.LocalDate;

public final class Ciclista extends Atleta{
    private double precioBicicleta;
    private double maxDistanciaRecorrida;
    private String bicicleta;
    private double resultado = 0;

    public Ciclista(String nombre, LocalDate fechaNacimiento, Pais pais, int nivelEnergia, double precioBicicleta, double maxDistanciaRecorrida, String bicicleta) {
        super(nombre, fechaNacimiento, pais, nivelEnergia);
        this.precioBicicleta = precioBicicleta;
        this.maxDistanciaRecorrida = maxDistanciaRecorrida;
        this.bicicleta = bicicleta;
    }

    @Override
    public void competir() {
        resultado = Math.random()*100;
        System.out.printf("El resultado de la competicion es %.2f", resultado);
    }

    @Override
    public void entrenar() {
        System.out.println("El ciclista está entrenando");

    }

    @Override
    public double obtenerPuntuacion() {
        System.out.printf("%.2f",resultado);
        return resultado;
    }
}
