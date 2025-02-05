import java.time.LocalDate;

public final class PowerLifter extends Atleta{
    private double pr;
    private double resultado;

    public PowerLifter(String nombre, LocalDate fechaNacimiento, Pais pais, int nivelEnergia, double pr) {
        super(nombre, fechaNacimiento, pais, nivelEnergia);
        this.pr = pr;
    }

    @Override
    public void competir() {
        resultado = Math.random()*100;
        System.out.printf("El resultado de la competicion es %.2f", resultado);
    }

    @Override
    public void entrenar() {

    }

    @Override
    public double obtenerPuntuacion() {
        return 0;
    }
}
