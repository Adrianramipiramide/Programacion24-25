public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int paginas;
    private int edicion;
    private String editorial;
    private String pais;
    //private date fecha;


    public Libro(String titulo, Persona autor, String ISBN, int paginas, int edicion, String editorial, String pais) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.pais = pais;
    }

    public Libro() {

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return
                "Titulo: " + titulo + "\n" +
                        "Autor: " + autor + "\n" +
                        "ISBN: " + ISBN + "\n" +
                        "Paginas:" + paginas + "\n" +
                         edicion+ " edicion" + "\n" +
                        "Editorial: " + editorial + "\n" +
                        "Pais= " + pais;
    }
}
