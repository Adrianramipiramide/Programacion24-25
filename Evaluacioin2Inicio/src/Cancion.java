import java.util.Scanner;

public class Cancion {
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        this.titulo = " ";
        this.autor = " ";
    }

    public String dameTitulo() {
        System.out.println("El titulo de la cancion es " + titulo);
        return titulo;
    }

    public String dameAutor() {
        System.out.println("El autor de la cancion es " + autor);
        return autor;
    }

    public void ponTitulo(String titulo){
        this.titulo=titulo;
    }

    public void ponAutor(String autor){
        this.autor=autor;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
