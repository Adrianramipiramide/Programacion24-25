import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class Libro {
    private String titulo;
    private String autor;
    private int year;
    private String isbn;
    private int numPaginas;
    private ArrayList<Libro> listaLibros;

    public Libro(String titulo, String autor, int year, String isbn, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    public Libro addlibro(ArrayList<Libro> libros, String titulo, String autor, int year, String isbn) {
        libros.add(new Libro(titulo, autor, year, isbn, numPaginas));
        return new Libro(titulo, autor, year, isbn,numPaginas);
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

    public static Libro buscarLibro(ArrayList<Libro> libros, String titulo){
       for (Libro libro: libros){
           if(titulo.equals(libro.getTitulo())){
               System.out.println("El libro introducido si está en el Array");
               return libro;
           }
       }
        return null;
    }

    public static void ordenarTitulo(ArrayList<Libro> listaLibros){
        listaLibros.sort(new Comparator());
    }

    public static void ordenarPaginas(ArrayList<Libro> listaLibros){
        listaLibros.sort(new ComparatorPaginas());
    }

    public static void mostrarLibros(ArrayList<Libro> libros){
        for(Libro l : libros){
            System.out.println(l);
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                ", numPaginas=" + numPaginas +
                ", listaLibros=" + listaLibros +
                '}';
    }
}
