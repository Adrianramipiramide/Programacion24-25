import java.util.ArrayList;

public class MainLibro {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("ZLa bolsa o la vida", "Joe Dominguez", 2020, "4385427", 500);
        Libro libro2 = new Libro("Make time", "JZ", 2020, "589475409", 250);
        libros.add(libro1);
        Libro.getLibro(libros, 0);
        Libro.numLibros(libros);
        libros.add(libro2);
        Libro.buscarLibro(libros, "La bolsa o la vida");
        Libro.ordenarPaginas(libros);
        System.out.println();
        Libro.mostrarLibros(libros);
        Libro.ordenarTitulo(libros);
        System.out.println();
        Libro.mostrarLibros(libros);


    }
}
