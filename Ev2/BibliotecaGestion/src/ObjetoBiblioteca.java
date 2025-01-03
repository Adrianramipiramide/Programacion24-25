public class ObjetoBiblioteca {
    private String codigo;
    private String titulo;
    private String year;

    public ObjetoBiblioteca(String codigo, String titulo, String year) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.year = year;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ObjetoBiblioteca{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
