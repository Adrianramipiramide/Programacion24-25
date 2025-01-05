import java.util.ArrayList;

public interface Prestable {
    public int cuentaPrestados(ArrayList<ObjetoBiblioteca> l);

    public void prestar();

    public void devolverLibro(boolean prestado);
}
