import java.time.LocalDate;

public final class Nadador extends Atleta{
    private EstiloNatacion estiloNatacion;
    private double mejorTiempo;

    public Nadador(String nombre, LocalDate fechaNacimiento, Pais pais, EstiloNatacion estiloNatacion, double mejorTiempo) {
        super(nombre, fechaNacimiento, pais);
        this.estiloNatacion = estiloNatacion;
        this.mejorTiempo = mejorTiempo;
    }
    static double puntuacion;
    @Override
    public void competir(){
        System.out.println("Esta compitiendo");
        puntuacion =  Math.random()*100;
        System.out.println("El nadador está compitiendo");
        System.out.printf("Ha obtenido una puntiacion de %.2f \n", puntuacion);
    }

    @Override
    public void entrenar() {
        System.out.println("El nadador está entrenando");
    }

    @Override
    public double obtenerPuntuacion() {
        return mejorTiempo;
    }
}
