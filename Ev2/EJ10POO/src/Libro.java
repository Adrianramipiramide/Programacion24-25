import java.util.TreeSet;

public class Libro {
    TreeSet<Libro> listaLIbros = new TreeSet();
    private int numPaginas;
    private String titulo;
    private String autor;

    public Libro( int numPaginas, String titulo, String autor) {
        this.numPaginas = numPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public TreeSet<Libro> getListaLIbros() {
        return listaLIbros;
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
}
