import java.util.HashSet;

public class MetodosLibros {
    public static String anadirLibro(HashSet<String> libros, String titulo, String autor) {
        libros.add(titulo);
        libros.add(autor);
        //como añado el genero de la lista del metodo de mas abajo ¿Lo hemos dado?

        return titulo;
    }

    public static void monstrarListaLibros(HashSet<String> libros) {
        System.out.println(libros);
    }

    public static void mostrarListaGeneros(HashSet<String> generos) {

        generos.add("Terror");
        generos.add("Aventura");
        generos.add("Comedia");
        generos.add("Desarrollo personal");
        generos.add("Cocina");
        System.out.println(generos);
    }
//Iterator es necesario??????????????
    public static String buscarPorAutor(String autor, HashSet<String> libros) {
        autor = autor.toLowerCase();
        //No deberia haber usado HashSet porque me lo muestra mal, me pone los libros y los autores desordenados como quiere, como lo muestro correctamente?
        if (libros.contains(autor)) {
            //Metodo para mostrar solo los libros que son de ese autor
            System.out.println("Existen libros de dicho autor");
        } else {
            System.out.println("No hay registrado ningún libro de ese Autor");
        }
        return autor;
    }

    /**
     * Metodo para eliminar libros
     *
     * @param titulo String
     * @param libros HashSet<String>
     * @return String
     */
    public static String eliminarLibro(String titulo, HashSet<String> libros) {
        titulo = titulo.toLowerCase();
        if (libros.contains(titulo)) {
            libros.remove(titulo);
        } else {
            System.out.println("No hay ningun libro registrado con ese titulo");
        }
        return titulo;
    }
}
