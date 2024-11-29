import java.util.ArrayList;

public class ArrayProducto {

    ArrayList<Producto> listaProductos ;

    public static void agregarProducto(Producto palabra, ArrayList<String> lista){
        lista.add(palabra.getNombre());
    }

    public static void eliminarProducto(Producto palabra, ArrayList<String> lista){
        lista.remove(palabra.getNombre());
    }

    public static void mostrarProducto(int posicion,ArrayList<String> lista){
        lista.get(posicion);
    }

}
