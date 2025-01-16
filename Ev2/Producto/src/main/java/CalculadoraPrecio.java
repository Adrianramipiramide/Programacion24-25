public class CalculadoraPrecio {
    private final double IVA = 1.21;
    public double precioConIVA(Producto producto1){

        return producto1.getPrecio()*IVA;
    }
}
