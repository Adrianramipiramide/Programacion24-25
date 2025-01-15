public class Producto {
    private double peso;
    private String nombre;
    private long codigo;

    public Producto(double peso, String nombre, long codigo) {
        this.peso = peso;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
