import java.util.ArrayList;

public class ArrayProducto {

    ArrayList<Producto> listaProductos ;

    public static void agregarProducto(Producto palabra, ArrayList<String> lista){
        lista.add(String.valueOf(palabra));
    }

    public static void eliminarProducto(String palabra, ArrayList<String> lista){
        lista.remove(palabra);
    }

    public static void mostrarProducto(int posicion,ArrayList<String> lista){
        lista.get(posicion);
    }

}
