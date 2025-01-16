public class Main {
    public static void main(String[] args) {

        CalculadoraPrecio calculadoraPrecio = new CalculadoraPrecio();
        Producto producto1 = new Producto(1.5, "Camisa", 15000);
        System.out.println(producto1);
        System.out.printf("%.2f", calculadoraPrecio.precioConIVA(producto1));

    }
}
