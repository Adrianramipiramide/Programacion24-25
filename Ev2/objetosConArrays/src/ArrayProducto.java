import java.util.ArrayList;

public class ArrayProducto {

    ArrayList<Producto> listaProductos ;

    public static void agregarProducto(Producto palabra, ArrayList<Producto> lista){
        lista.add(palabra);
    }

    public static void eliminarProducto(Producto palabra, ArrayList<Producto> lista){
        lista.remove(palabra);
    }

    public static void mostrarProducto(int posicion,ArrayList<Producto> lista){

        System.out.println( lista.get(posicion));
    }
}
