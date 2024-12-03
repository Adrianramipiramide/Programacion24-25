import java.util.ArrayList;

public class MainProducto {
    public static void main(String[] args) {
        ArrayList<Producto> lista= new ArrayList<>();
        Producto producto1 = new Producto(324523,"Reloj","Objeto",50,25);
        Producto producto2 = new Producto(879879, "Pechuga de pollo", "Pollo",1.5,32);
        Producto producto3 = new Producto(45689, "Television", "Objeto",550,2);
        Producto producto4 = new Producto(65767, "Seat Ibiza", "Automovil",8000,54);
        Producto producto5 = new Producto(345534, "Anillo", "Joya",1020,23);

        ArrayProducto.agregarProducto(producto2, lista);
        ArrayProducto.agregarProducto(producto3, lista);
        System.out.println(lista);
        ArrayProducto.mostrarProducto(1,lista);
        System.out.println(producto2.getPrecio());
        ArrayProducto.eliminarProducto(producto3,lista);
        System.out.println(lista);
    }
}
