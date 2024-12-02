
public class Ordenador implements Comparable<Ordenador> {
    private String referencia;
    private int ram;
    private double precio;

    public Ordenador(String referencia, int ram, double precio) {
        this.referencia = referencia;
        this.ram = ram;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "referencia='" + referencia + '\'' +
                ", ram=" + ram +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Ordenador ordenador) {

        return (int)(this.precio-ordenador.precio);
    }
}
