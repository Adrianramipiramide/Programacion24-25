import java.util.HashSet;

public class DiscoPrestable extends Disco implements Prestable {

    private static HashSet prestados = new HashSet();

    public DiscoPrestable(String autor, String titulo, String formato, double duracion, String genero) {
        super(autor, titulo, formato, duracion, genero);
    }

    public static int cuentaPrestados() {
        return prestados.size();
    }

    public void prestar(){
        prestados.add(this);
    }
}
