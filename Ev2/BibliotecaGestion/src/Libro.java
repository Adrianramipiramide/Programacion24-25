import java.util.ArrayList;

public class Libro extends ObjetoBiblioteca implements Prestable {
    private boolean prestado = false;

    public Libro(String codigo, String titulo, int year, boolean prestado) {
        super(codigo, titulo, year);
        this.prestado = prestado;
    }

    int contadorPrestados = 0;

    
    public int cuentaPrestados(ArrayList<ObjetoBiblioteca>l) {
        int contador = 0;
        for(ObjetoBiblioteca o : l)
        System.out.println(contadorPrestados);
        return contadorPrestados;
    }

    @Override
    public void prestar() {
        contadorPrestados++;
        prestado = true;

    }

    @Override
    public void devolverLibro(boolean prestado) {
        if (prestado == true) {
            prestado = false;
        }
        System.out.println("El libro ya no está prestado");
        contadorPrestados--;
    }

    public boolean librosAntesDe(Libro l, int year) {
        if (l.getYear() < year) {
            System.out.println("El libro si es anterior a la fecha");
            return true;
        } else {
            System.out.println("El libro no es anterior a la fecha " + year);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString() +
                "prestado=" + prestado +
                '}';
    }
}