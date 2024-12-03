import java.util.ArrayList;

public class MainLibro {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("La bolsa o la vida", "Joe Dominguez", 2020,"4385427");
        libros.add(libro1);
        Libro.getLibro(libros,0);
        Libro.numLibros(libros);
    }
}
