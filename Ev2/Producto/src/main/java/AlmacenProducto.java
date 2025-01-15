import java.util.ArrayList;

public class AlmacenProducto {

    public void guardarProducto(Producto producto){
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto);
    }

    public static void mostrarProducto(ArrayList<Producto> lista){
        for (Producto p: lista){
            System.out.println(p);
        }
    }
}
