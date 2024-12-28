import java.util.ArrayList;

public class Libro {
    ArrayList<Libro> listaLIbros = new ArrayList<>();
    private int numPaginas;
    private String titulo;
    private String autor;

    public Libro(int numPaginas, String titulo, String autor) {
        this.numPaginas = numPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static String eliminarLibro(int posicion, ArrayList<Libro> listaLibros) {
        listaLibros.remove(posicion);
        return posicion + " se ha eliminado";
    }

    public static Libro getLibroPorPosicion(int posicion, ArrayList<Libro> listaLibros) {

        return listaLibros.get(posicion);
    }

    @Override
    public String toString() {
        return "Libro{" +
                " numPaginas=" + numPaginas +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public static void ordenarPorTitulo(ArrayList<Libro> listaLIbros) {
        ArrayList<Libro> listaOrdenada = new ArrayList<>();
        for (Libro l : listaLIbros) {
            boolean libroAgregado = false;
            for (int i = 0; i < listaOrdenada.size(); i++) {
                if (l.getTitulo().compareToIgnoreCase(listaOrdenada.get(i).getTitulo()) < 0) {
                    listaOrdenada.add(i, l);
                    libroAgregado = true;
                    break;
                }
            }
            if (!libroAgregado) {
                listaOrdenada.add(l);
            }
        }

        System.out.println(listaOrdenada);

    }

    public static void mostrarInfoLibros(ArrayList<Libro> listaLIbros) {
        for (Libro l : listaLIbros) {
            System.out.println(l);
        }
    }
}
