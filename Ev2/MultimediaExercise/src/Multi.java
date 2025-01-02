public class Multi {
    private String autor;
    private String titulo;
    private String formato;
    private double duracion;

    public Multi(String autor, String titulo, String formato, double duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Compara referencias
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica tipos
        Multi multimedia = (Multi) obj;
        return titulo.equals(multimedia.titulo) && autor.equals(multimedia.autor);
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", formato='" + formato + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
