public class Producto {
    private double peso;
    private String nombre;
    private double precio;
    private int codigo;
    private int codigoSiguiente = 1;

    public Producto(){


    }

    public Producto(double peso, String nombre, double precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigoSiguiente++;
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

    public double getPrecio() {
        return precio;
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
