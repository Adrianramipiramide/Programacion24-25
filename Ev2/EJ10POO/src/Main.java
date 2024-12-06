import java.util.TreeSet;

/*
Desarrollar una lista de Libros (titulo, autor y número de páginas) ordenada por título.
La funcionalidad de la lista será la habitual: conocer el número de libros que hay en la lista,
insertar un nuevo libro (en la posición que le corresponda), eliminar el libro de una determinada
posición y obtener el libro de una determinada posición. No admitirá libros duplicados, entendiéndose como
duplicado un libro que tenga el título y el autor iguales (sin tener en cuenta mayúsculas o minúsculas).
También incluirá un método para buscar un libro a partir de una parte de su título
(sin distinguir entre mayúsculas y minúsculas); el método devolverá la posición en la que se
 encuentra el libro (–1 si no se encuentra).
Habrá un método que muestre toda la información de todos los libros de la colección.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Libro> listaLibros = new TreeSet<Libro>();
        Libro libro1 = new Libro(250,"Make Time", "Juan");
        Libro libro2 = new Libro(320, "Limitless", "James Clear");
        Libro libro3 = new Libro(250, "Elon Musk", "Aitor");


    }
}
