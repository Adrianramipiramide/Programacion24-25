import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


/*
Desarrolla una aplicación de consola que gestione una biblioteca. La aplicación debe permitir registrar libros,
buscar libros y gestionar préstamos a usuarios.
 */
public class BibliotecaExamen {
    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor de la biblioteca");
        HashSet<String> listaLibros = new HashSet<>();
        ArrayList<String> listaUsuarios = new ArrayList<>();
        HashMap<String, String> prestamos = new HashMap<>();

        
        registrarLibro(listaLibros, "Deep Work", "Josh");
        registrarLibro(listaLibros, "El arte de la guerra", "Sun Tzu");
        registrarLibro(listaLibros, "El Almanaque de Naval", "Tim Ferris");

        mostrarListaLibros(listaLibros);

        registrarUsuario(listaUsuarios, "Josh");
        registrarUsuario(listaUsuarios, "Walker");
        registrarUsuario(listaUsuarios, "Flavio");
        registrarUsuario(listaUsuarios, "Castel");

        eliminarUsuario(listaUsuarios, "Walker");

        mostrarUsuario(listaUsuarios);

        pedirPrestamo(listaUsuarios, prestamos, "Jaime", "El arte de la guerra");
        pedirPrestamo(listaUsuarios, prestamos, "John", "Never Ending");

        mostrarPrestamos(prestamos);

    }

    public static void registrarLibro(HashSet<String> Libros, String libro, String autor) {
        Libros.add(libro);
    }

    public static void registrarUsuario(ArrayList<String> listaUsuario, String usuario) {
        listaUsuario.add(usuario);
    }
    public static void eliminarUsuario(ArrayList<String> listaUsuario, String usuario){
        listaUsuario.remove(usuario);
    }

    public static void mostrarListaLibros(HashSet<String> libros) {
        System.out.println("Libros");
        System.out.println(libros);
    }

    public static void mostrarUsuario(ArrayList<String> Usuarios) {
        System.out.println("\nUsuarios");
        System.out.println(Usuarios);
    }

    public static void pedirPrestamo(ArrayList<String> Usuarios, HashMap<String, String> prestamo, String autor, String titulo) {
        prestamo.put(titulo, Usuarios.get(1));

    }

    public static void mostrarPrestamos(HashMap<String, String> Prestamos) {
        System.out.println("\nPrestramos");
        System.out.println(Prestamos);
    }

}