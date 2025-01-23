import java.time.LocalDate;

public final class Nadador extends Atleta{
    private EstiloNatacion estiloNatacion;
    private double mejorTiempo;

    public Nadador(String nombre, LocalDate fechaNacimiento, Pais pais, EstiloNatacion estiloNatacion, double mejorTiempo) {
        super(nombre, fechaNacimiento, pais);
        this.estiloNatacion = estiloNatacion;
        this.mejorTiempo = mejorTiempo;
    }

    @Override
    public void competir(){
        System.out.println("Esta compitiendo");
    }

    @Override
    public void entrenar() {

    }

    @Override
    public double obtenerPuntuacion() {
        return mejorTiempo;
    }
}
