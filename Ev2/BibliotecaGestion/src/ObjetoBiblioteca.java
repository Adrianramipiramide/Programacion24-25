public class ObjetoBiblioteca {
    private String codigo;
    private String titulo;
    private int year;

    public ObjetoBiblioteca(String codigo, String titulo, int year) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.year = year;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getYear() {
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
