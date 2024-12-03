import java.util.ArrayList;
import java.util.Arrays;

public class Libro {
    private String titulo;
    private String autor;
    private int year;
    private String isbn;

    public Libro(String titulo, String autor, int year, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.isbn = isbn;
    }

    public Libro addlibro(ArrayList<Libro> libros, String titulo, String autor, int year, String isbn) {
        libros.add(new Libro(titulo, autor, year, isbn));
        return new Libro(titulo, autor, year, isbn);
    }

    //Devuelve el numero de libros
    public static int numLibros(ArrayList<Libro> libros){
        System.out.println("El numero de libros dentro de la lista es " + libros.size());
        return libros.size();
    }
    public static int eliminarLibro(ArrayList<Libro> libros, int posicion){
        libros.remove(posicion);
        return posicion;
    }
    public static Libro getLibro(ArrayList<Libro> libros,int posicion){
        libros.get(posicion);
        return libros.get(posicion);
    }

    public static void buscarLibro(ArrayList<Libro> libros, String titulo){
      //  Arrays.binarySearch(libros,titulo);

    }
}
